/*
* Copyright 2013 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/


package com.example.android.bluetoothchat;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ViewAnimator;

import com.example.android.common.activities.SampleActivityBase;
import com.example.android.common.logger.Log;
import com.example.android.common.logger.LogFragment;
import com.example.android.common.logger.LogWrapper;
import com.example.android.common.logger.MessageOnlyLogFilter;

public class MainActivity extends SampleActivityBase {

    public static final String TAG = "MainActivity";

    // Whether the Log Fragment is currently shown
    private boolean mLogShown;

    private final short minBpm = 40;
    private final short maxBpm = 250;
    private short bpm = 110;

    private short time = 4;
    private double downBeat = 880;
    private double beat = 440;

    public MetronomeAsyncTask metTask;
    private EditText eTextBPM;
    private Button btnPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            BluetoothChatFragment fragment = new BluetoothChatFragment();
            transaction.replace(R.id.sample_content_fragment, fragment);
            transaction.commit();
        }

        metTask = new MetronomeAsyncTask();

        eTextBPM = (EditText) findViewById(R.id.editTxtBPM);
        eTextBPM.setText("" + bpm);

        btnPlay = (Button) findViewById(R.id.btnPlay);
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.HONEYCOMB)
            public synchronized void onClick(View v) {
                Button btn = (Button) v;
                String btnText = btn.getText().toString();
                if (btnText.equalsIgnoreCase("play")) {
                    btn.setText("Stop");
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB)
                        metTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Void[]) null);
                    else
                        metTask.execute();
                } else {
                    btn.setText("Play");
                    metTask.stop();
                    metTask = new MetronomeAsyncTask();
                    Runtime.getRuntime().gc();
                }
            }
        });

        eTextBPM.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEARCH ||
                        actionId == EditorInfo.IME_ACTION_DONE ||
                        event.getAction() == KeyEvent.ACTION_DOWN &&
                                event.getKeyCode() == KeyEvent.KEYCODE_ENTER) {
                    InputMethodManager in = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    in.hideSoftInputFromWindow(eTextBPM.getApplicationWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
                    try {
                        Short newbpm = Short.parseShort(eTextBPM.getText().toString());
                        if (newbpm < minBpm) {
                            bpm = minBpm;
                            eTextBPM.setText("" + bpm);
                        } else if (newbpm > maxBpm) {
                            bpm = maxBpm;
                            eTextBPM.setText("" + bpm);
                        } else
                            bpm = newbpm;
                        eTextBPM.clearFocus();
                        return true;
                    } catch (NumberFormatException e) {
                        eTextBPM.setText("" + bpm);
                    }
                }
                return false;
            }
        });
    } // onCreate

    private class MetronomeAsyncTask extends AsyncTask<Void,Void,String> {
        Metronome met;

        MetronomeAsyncTask() {
            met = new Metronome();
        }

        protected String doInBackground(Void... params) {
            met.setTime(time);
            met.setBpm(bpm);
            met.setdownBeat(downBeat);
            met.setBeat(beat);
            met.play();
            return null;
        }

        public void stop() {
            met.stop();
            met = null;
        }
    } // END MetronomeAsyncTask

    public void onBackPressed() {
        metTask.stop();
        Runtime.getRuntime().gc();
        finish();
    } // END onBackPressed

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem logToggle = menu.findItem(R.id.menu_toggle_log);
        logToggle.setVisible(findViewById(R.id.sample_output) instanceof ViewAnimator);
        logToggle.setTitle(mLogShown ? R.string.sample_hide_log : R.string.sample_show_log);

        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.menu_toggle_log:
                mLogShown = !mLogShown;
                ViewAnimator output = (ViewAnimator) findViewById(R.id.sample_output);
                if (mLogShown) {
                    output.setDisplayedChild(1);
                } else {
                    output.setDisplayedChild(0);
                }
                supportInvalidateOptionsMenu();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /** Create a chain of targets that will receive log data */
    @Override
    public void initializeLogging() {
        // Wraps Android's native log framework.
        LogWrapper logWrapper = new LogWrapper();
        // Using Log, front-end to the logging chain, emulates android.util.log method signatures.
        Log.setLogNode(logWrapper);

        // Filter strips out everything except the message text.
        MessageOnlyLogFilter msgFilter = new MessageOnlyLogFilter();
        logWrapper.setNext(msgFilter);

        // On screen logging via a fragment with a TextView.
        LogFragment logFragment = (LogFragment) getSupportFragmentManager()
                .findFragmentById(R.id.log_fragment);
        msgFilter.setNext(logFragment.getLogView());

        Log.i(TAG, "Ready");
    }
}

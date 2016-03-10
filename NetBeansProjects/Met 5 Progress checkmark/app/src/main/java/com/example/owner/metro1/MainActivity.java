package com.example.owner.metro1;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private final short minBpm = 40;
    private final short maxBpm = 250;
    private short bpm = 110;

    private short time = 4;
    private double downBeat = 880;
    private double beat = 440;

    private MetronomeAsyncTask metTask;
    // This EditText is the biggest pain in the ass ever.
    // TextView is way easier just sayin lol
    private EditText eTextBPM;
    private ToggleButton togBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        metTask = new MetronomeAsyncTask();

        eTextBPM = (EditText) findViewById(R.id.editTxtBPM);
        eTextBPM.setText("" + bpm);

        eTextBPM.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEARCH ||
                        actionId == EditorInfo.IME_ACTION_DONE ||
                        event.getAction() == KeyEvent.ACTION_DOWN &&
                                event.getKeyCode() == KeyEvent.KEYCODE_ENTER) {
                    // Make keyboard not always in focus after entering EditText bs.
                    InputMethodManager in = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    in.hideSoftInputFromWindow(eTextBPM.getApplicationWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
                    try { // Make sure user doesn't enter a number outside
                          // of short (16-bit signed two's complement, (-32768,32767))
                        Short newbpm = Short.parseShort(eTextBPM.getText().toString());
                        // Self explanatory...
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

        togBtn = (ToggleButton) findViewById(R.id.btnPlay);
        togBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            // Target Honeycomb and up (just to be safe)
            @TargetApi(Build.VERSION_CODES.HONEYCOMB)
            // ToggleButton handler
            @Override
            public synchronized void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB)
                        // Threading bs.
                        metTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Void[]) null);
                    else
                        metTask.execute();
                } else {
                    metTask.stop();
                    metTask = new MetronomeAsyncTask();
                    Runtime.getRuntime().gc(); // GARBAGE COLLECTION FTW...lawl
                }
            }
        });
    } // END onCreate

    public void onBackPressed() {
        metTask.stop();
        Runtime.getRuntime().gc();
        finish();
    } // END onBackPressed

    // AsyncTask lets us use the UI thread. In our case we want to
    // use the background operations. Link in case you care to peep it.
    // http://developer.android.com/reference/android/os/AsyncTask.html
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

}

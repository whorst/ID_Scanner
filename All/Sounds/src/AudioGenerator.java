package com.example.android.bluetoothchat;

import android.media.AudioTrack;

/* *************************************************************
 * *************************************************************
 * *************************************************************
 *                    DON'T TOUCH THIS CODE
 * *************************************************************
 * *************************************************************
 * *************************************************************
 */

// This is working code which we can get a grade with. I have better
// and more improved code that I'm still working on.

import android.media.AudioFormat;
import android.media.AudioManager;

public class AudioGenerator {
    private int sampleRate;
    private AudioTrack audioTrack;

    public AudioGenerator(int sampleRate) {
        this.sampleRate = sampleRate;
    }

    // Returns array of samples with frequency and sample rate.
    // Frequency is used to distinguish between the down beat.
    public double[] getSineWave(int samples,int sampleRate,double frequencyOfTone){
        double[] sample = new double[samples];
        // Essentially the "wave info"
        for (int i = 0; i < samples; i++)
            sample[i] = Math.sin(2 * Math.PI * i / (sampleRate/frequencyOfTone));
        return sample;
    }

    // Returns PCM (Pulse Code Modulation) byte array.
    // PCM is used to digitally represent sampled analog signals.
    // Basically, think about a waveform and at specific UNIFORM
    // intervals there is a sample of data with information.
    // Look it up if you're curious.
    public byte[] get16BitPcm(double[] samples) {
        byte[] generatedSound = new byte[2 * samples.length];
        int index = 0;
        for (double sample : samples) {
            short maxSample = (short) ((sample * Short.MAX_VALUE));
            generatedSound[index++] = (byte) (maxSample & 0x00ff);
            generatedSound[index++] = (byte) ((maxSample & 0xff00) >>> 8);
        }
        return generatedSound;
    }

    public void createPlayer(){
        audioTrack = new AudioTrack(AudioManager.STREAM_MUSIC,
                sampleRate, AudioFormat.CHANNEL_OUT_MONO,
                AudioFormat.ENCODING_PCM_16BIT, sampleRate,
                AudioTrack.MODE_STREAM);
        audioTrack.play();
    }

    public void writeSound(double[] samples) {
        byte[] generatedSnd = get16BitPcm(samples);
        audioTrack.write(generatedSnd, 0, generatedSnd.length);
    }

    // RIP.
    public void destroyAudioTrack() {
        audioTrack.stop();
        audioTrack.release();
    }
}

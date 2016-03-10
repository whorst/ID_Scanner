package com.example.android.bluetoothchat;

public class Metronome {
    private double bpm;
    private int time;
    private int silence;

    private double downBeat;
    private double beat;
    private final int tick = 1000;

    private boolean play = true;

    private AudioGenerator audioGenerator = new AudioGenerator(44100);

    public Metronome() {
        audioGenerator.createPlayer();
    }

    public void calcSilence() {
        silence = (int) (((60/bpm)*44100)-tick);
    }

    public void play() {
        calcSilence();
        double[] tick = audioGenerator.getSineWave(this.tick, 44100, beat);
        double[] tock = audioGenerator.getSineWave(this.tick, 44100, downBeat);
        double silence = 0;
        double[] beat = new double[44100];
        int t = 0,s = 0,b = 0;
        do {
            for(int i=0;i<beat.length&&play;i++) {
                if(t<this.tick) {
                    if(b == 0)
                        beat[i] = tock[t];
                    else
                        beat[i] = tick[t];
                    t++;
                } else {
                    beat[i] = silence;
                    s++;
                    if(s >= this.silence) {
                        t = 0;
                        s = 0;
                        b++;
                        if(b > (this.time-1))
                            b = 0;
                    }
                }
            }
            audioGenerator.writeSound(beat);
        } while(play);
    }

    public void stop() {
        play = false;
        audioGenerator.destroyAudioTrack();
    }

    public void setBpm(Short bpm) {
        this.bpm = bpm;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setdownBeat(double downBeat) {
        this.downBeat = downBeat;
    }

    public void setBeat(double beat) {
        this.beat = beat;
    }

    public int getBpm() {
        return (int) this.bpm;
    }

    public int getTime() {
        return (int) this.time;
    }
}

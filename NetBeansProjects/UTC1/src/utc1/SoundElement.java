/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utc1;

/**
 *
 * @author Willy
 */
    import javax.sound.sampled.*;

public class SoundElement implements Runnable {
	SoundTest soundTest;

	// TEMPO CHANGE
	// 750000000=80bpm | 600000000=100bpm | 300000000=200bpm | 200000000=300bpm
	long nsDelay = 600000000;

	long before;
	long after;
	long diff;

	String name = "";
	int clickLength = 4100;
	byte[] audioFile;
	double clickFrequency;
	double subdivision;
	SourceDataLine line = null;
	long audioFilePlay;

	public SoundElement(SoundTest soundTestIn, String nameIn, double clickFrequencyIn, double subdivisionIn) {
		soundTest = soundTestIn;
		name = nameIn;
		clickFrequency = clickFrequencyIn;
		subdivision = subdivisionIn;
		generateAudioFile();
	}

	public void generateAudioFile() {
		audioFile = new byte[clickLength * 2];
		double temp;
		short maxSample;

		int p = 0;
		for (int i = 0; i < audioFile.length;) {
			temp = Math.sin(2 * Math.PI * p++ / (soundTest.sampleRate / clickFrequency));
			maxSample = (short) (temp * Short.MAX_VALUE);
			System.out.println(maxSample);
			audioFile[i++] = (byte) (maxSample & 0x00ff);
			audioFile[i++] = (byte) ((maxSample & 0xff00) >>> 8);
		}
	}

	public void run() {
		createPlayer();
		audioFilePlay = soundTest.startTime + nsDelay;

		while (soundTest.playing) {
			if (System.nanoTime() >= audioFilePlay) {
				play();
				destroyPlayer();
				createPlayer();
				audioFilePlay += nsDelay;
			}
		}
		try {
			destroyPlayer();
		} catch (Exception e) {
		}
	}

	public void createPlayer() {
		AudioFormat af = new AudioFormat(soundTest.sampleRate, 16, 1, true, false);
		try {
			line = AudioSystem.getSourceDataLine(af);
			line.open(af);
			line.start();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void play() {
		line.write(audioFile, 0, audioFile.length);
	}

	public void destroyPlayer() {
		line.drain();
		line.close();
	}
}


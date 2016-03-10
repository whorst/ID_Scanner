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
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.sound.sampled.SourceDataLine;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class SoundTest implements ActionListener {
	static SoundTest soundTest;

	// ENABLE/DISABLE SOUNDS
	boolean playSound1 = true;
	boolean playSound2 = true;

	JFrame mainFrame;
	JPanel mainContent;
	JPanel center;
	JButton buttonPlay;

	int sampleRate = 44100;
	long startTime;
	SourceDataLine line = null;
	int tickLength;
	boolean playing = false;

	SoundElement sound01;
	SoundElement sound02;

	public static void main(String[] args) {
		soundTest = new SoundTest();

                
                long x = (System.currentTimeMillis() / 1000) + 4;
		System.out.println(x);
                
                
               currTimeCheck(x);
	}

	public void gui_CreateAndShow() {
		gui_FrameAndContentPanel();
		gui_AddContent();
	}

	public void gui_FrameAndContentPanel() {
		mainContent = new JPanel();
		mainContent.setLayout(new BorderLayout());
		mainContent.setPreferredSize(new Dimension(500, 500));
		mainContent.setOpaque(true);

		mainFrame = new JFrame("Sound Test");
		mainFrame.setContentPane(mainContent);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.pack();
		mainFrame.setVisible(true);
	}

	public void gui_AddContent() {
		JPanel center = new JPanel();
		center.setOpaque(true);

		buttonPlay = new JButton("PLAY / STOP");
		buttonPlay.setActionCommand("play");
		buttonPlay.addActionListener(this);
		buttonPlay.setPreferredSize(new Dimension(200, 50));

		center.add(buttonPlay);
		mainContent.add(center, BorderLayout.CENTER);
	}

	public void actionPerformed(ActionEvent e) {
		if (!playing) {
			playing = true;

			if (playSound1)
				sound01 = new SoundElement(this, "Sound1", 800, 1);
			if (playSound2)
				sound02 = new SoundElement(this, "Sound2", 1200, 1);

			startTime = System.nanoTime();

			if (playSound1)
				new Thread(sound01).start();
			if (playSound2)
				new Thread(sound02).start();
		} else {
			playing = false;
		}
	}
        
        	public static void currTimeCheck(long x) {
		try {
			if (x == (System.currentTimeMillis() / 1000)) {      
                           
                            System.out.println("4 Seconds");
                            rundisshitdo(); 
                            System.exit(0);
			} else {
				currTimeCheck(x); 
			}
		} catch (StackOverflowError e) {
			currTimeCheck(x);
		}
	}
     public static void go(){
     
         rundisshitdo();
     }      
    public static void rundisshitdo(){
     SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				soundTest.gui_CreateAndShow();
			}
		});}            
}


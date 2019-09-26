package _01_IntroToArrayLists;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.applet.AudioClip;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements MouseListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	Random rand = new Random();
	ArrayList<String> songs = new ArrayList<String>();
	int random;

	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setSize(600, 400);
		panel.add(button);
		button.setText("Surprise Me!");
		button.addMouseListener(this);
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
		
		songs.add("RoadRollerDa.mp3");
		songs.add("7pagesOfMuda.mp3");
		songs.add("demo.mp3");
		
	}

	public static void main(String[] args) {
		new _06_IPodShuffle();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		random = rand.nextInt(songs.size() - 1);
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			new Song(songs.get(random)).play();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
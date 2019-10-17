package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener{
	Stack<String> words = new Stack<String>();
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JLabel l = new JLabel();
	int lives;
	String wordTrack;
	String displayWords;
	
	public static void main(String[] args) {
		HangMan hangman = new HangMan();
	}
	public void window() {
		f.add(p);
		p.add(l);
		f.pack();
		f.setVisible(true);
		f.addKeyListener(this);
	}
	public void wordList() {
		String userInput = JOptionPane.showInputDialog("Enter a random integer from 1 to "+("dictionary.txt").length());
		int numOfWords = Integer.parseInt(userInput);
		for(int i = 0; i<numOfWords;i++) {
			String dictionary = Utilities.readRandomLineFromFile("dictionary.txt");
			if(!words.contains(dictionary));
			words.push(dictionary);
		}
	}
	public void showNewWord() {
		displayWords = "";
		wordTrack=words.pop();
		for(int i =0;i<wordTrack.length();i++) {
			wordTrack+="_";
		}
		l.setText(displayWords);
		lives=10;
		f.setSize(0,0);
		f.pack();
	}
	public HangMan() {

		window();
		wordList();
		showNewWord();
		lives();

	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}

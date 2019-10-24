package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener{
	static Stack<String> words = new Stack<String>();
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JLabel l = new JLabel("");
	JLabel labelLives = new JLabel("");
	static String a;
	static String total = "";
	static int num; 
	int lives = 8;
	int answered;
	
	public static void main(String[] args) {
		HangMan hangman = new HangMan();
		num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number from 1 to 266: "));
		for(int i = 0;i<num;i++) {
			words.push(Utilities.readRandomLineFromFile("dictionary.txt"));
		}
		a = words.pop();
		for(int i = 0; i<a.length();i++) {
			total+="_ ";
		}
		hangman.setUp();
	}
	public void setUp() {
		f.add(p);
		p.add(l);
		p.add(labelLives);
		f.pack();
		f.setVisible(true);
		f.addKeyListener(this);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		Boolean alive = false;
		for(int i = 0 ; i<a.length();i++) {
			if(e.getKeyChar()==a.charAt(i)) {
				total = total.substring(0,i)+a.charAt(i)+total.substring(i+1,a.length());
				alive = true;
			}
		}
		l.setText(total);
		if(alive==false) {
			lives--;
			labelLives.setText(Integer.toString(lives));
		}
		if(lives==0) {
			System.out.println("You are dead, noob.");
			String yn = JOptionPane.showInputDialog("Would you like to play again? (Yes/No)");
			if (yn.equalsIgnoreCase("yes")) {
				lives = 8;
				labelLives.setText(Integer.toString(lives));
			}
		}
		if(!total.contains("_ ")) {
			answered ++;
			if(num == answered) {
				System.out.println("You win");
			} else {
				a=words.pop();
				total="";
				for(int i =0;i<a.length();i++) {
					total += "_ ";
					l.setText(total);
				}
			}
		}
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

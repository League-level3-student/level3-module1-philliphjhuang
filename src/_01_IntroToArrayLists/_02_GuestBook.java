package _01_IntroToArrayLists;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements MouseListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	ArrayList<String> strings = new ArrayList<String>();
	String name;
public static void main(String[] args) {
	_02_GuestBook gb = new _02_GuestBook();
	gb.setUp();
}



public void setUp() {
	f.setVisible(true);
	f.add(p);
	p.add(b1);
	p.add(b2);
	b1.setText("Add Name");
	b2.setText("View Names");
	b1.addMouseListener(this);
	b2.addMouseListener(this);
	f.pack();
	
}



@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
}



@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==b1) {
		name = JOptionPane.showInputDialog("Enter a Name");
		strings.add(name);
	} else if(e.getSource()==b2) {
		for(int i = 0; i < strings.size(); i++) {
			name = strings.get(i);
			System.out.println("Guest #" + i + ": " + name);;
		}
	}
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
	


package _06_Intro_To_Hash_Maps;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements MouseListener{
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	HashMap<Integer,String> boi = new HashMap<Integer,String>();
	JButton entry = new JButton("Add Entry");
	JButton ID = new JButton("Search ID");
	JButton list = new JButton("View List");
	JButton remove = new JButton("Remove Entry");
	JPanel p = new JPanel();
	JFrame f = new JFrame();
	
	public static void main(String[] args) {
	_02_LogSearch ls = new _02_LogSearch();
	ls.setUp();
	}
	public void setUp() {
		f.add(p);
		p.add(entry);
		p.add(ID);
		p.add(list);
		p.add(remove);
		f.pack();
		f.setVisible(true);
		entry.addMouseListener(this);
		ID.addMouseListener(this);
		list.addMouseListener(this);
		remove.addMouseListener(this);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==entry) {
			String input1 = JOptionPane.showInputDialog("Enter an ID number");
			int ID = Integer.parseInt(input1);
			String name = JOptionPane.showInputDialog("Enter a name");
			boi.put(ID, name);
		}
		else if(e.getSource()==ID) {
			String input3 = JOptionPane.showInputDialog("Enter an ID number");
			int searchID = Integer.parseInt(input3);
			String name = boi.get(searchID);
			if(name == null) {
				System.out.println("That entry does not exists");
			} else {
				System.out.println(searchID +" is "+name);
			}
		}
		else if(e.getSource()==list) {
			Object[] idList = boi.keySet().toArray();
			String list = "";
			for(int i = 0; i < idList.length; i++) {
				list += "ID: " + idList[i] + "   Name: " + boi.get(idList[i]) + "\n";
			}
			System.out.println(list);
		} else if(e.getSource()==remove) {
			String input4 = JOptionPane.showInputDialog("Enter the ID number you want to delete");
			int ID = Integer.parseInt(input4);
			String name = boi.get(ID);
			boi.remove(ID, name);
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

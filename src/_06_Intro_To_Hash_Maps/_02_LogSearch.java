package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	HashMap<Integer, String> IDs = new HashMap<Integer, String>();

	public static void main(String[] args) {
		_02_LogSearch l = new _02_LogSearch();
		l.JStuff();
	}

	/*
	 * Crate a HashMap of Integers for the keys and Strings for the values. Create a
	 * GUI with three buttons. Button 1: Add Entry When this button is clicked, use
	 * an input dialog to ask the user to enter an ID number. After an ID is
	 * entered, use another input dialog to ask the user to enter a name. Add this
	 * information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID When this button is clicked, use an input dialog to
	 * ask the user to enter an ID number. If that ID exists, display that name to
	 * the user. Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list in a
	 * message dialog in the following format: ID: 123 Name: Harry Howard ID: 245
	 * Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4: Remove
	 * Entry When this button is clicked, prompt the user to enter an ID using an
	 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
	 * the user that the ID is not in the list.
	 *
	 */
	void JStuff() {
		f.setVisible(true);
		f.add(p);
		p.add(button1);
		p.add(button2);
		p.add(button3);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1.setText("ADD");
		button2.setText("SEARCH");
		button3.setText("VIEW");
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		f.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button1) {
			String Sid = JOptionPane.showInputDialog("enter an ID");
			int id = Integer.parseInt(Sid);
			String name = JOptionPane.showInputDialog("enter a name");
			IDs.put(id, name);

		}
		if (e.getSource() == button2) {

		}
		if (e.getSource() == button3) {
			for (Integer i : IDs.keySet()) {
				JOptionPane.showMessageDialog(f, "ID: " + i + " Name: " + IDs.get(i));

			}

		}
	}
}

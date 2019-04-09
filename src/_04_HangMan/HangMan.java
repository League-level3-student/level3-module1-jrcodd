package _04_HangMan;

import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class HangMan {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JTextArea t = new JTextArea();
	String currentWord;
	Stack<String> words = new Stack<String>();

	public static void main(String[] args) {
		HangMan hm = new HangMan();
		hm.JStuff();
		String numberOfWords = JOptionPane.showInputDialog(null,
				"Welcome to HANGMAN! \n How many words would you like to guess?");
		for (int i = 0; i < Integer.parseInt(numberOfWords); i++) {

		}

	}

	void JStuff() {
		f.add(p);
		p.add(t);
		f.setVisible(true);

	}

}

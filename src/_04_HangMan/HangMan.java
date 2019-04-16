package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HangMan implements KeyListener {
	static JFrame f = new JFrame();
	static JPanel p = new JPanel();
	static JTextField t = new JTextField();
	static String currentWord = "";
	static Stack<String> words = new Stack<String>();

	public static void main(String[] args) {
		HangMan hm = new HangMan();
		hm.JStuff();
		String numberOfWords = JOptionPane.showInputDialog(null,
				"Welcome to HANGMAN! \n How many words would you like to guess?");
		for (int i = 0; i < Integer.parseInt(numberOfWords); i++) {
			words.push(Utilities.readRandomLineFromFile("dictionary.txt"));
		}
		for (int i = 0; i < words.peek().length(); i++) {
			currentWord += "_";
		}
		t.setText(currentWord);
		System.out.println(words.peek());
	}

	void JStuff() {
		f.add(p);
		p.add(t);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		t.addKeyListener(this);
		t.setEditable(false);

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

		for (int j = 0; j < words.peek().length(); j++) {

			if (words.peek().charAt(j) != '_') {

			} else {
				if (words.peek().charAt(j) == e.getKeyChar()) {
					currentWord = currentWord.substring(0, j) + e.getKeyChar()
							+ currentWord.substring(j + 1, currentWord.length());
					System.out.println(currentWord);
					t.setText(currentWord);

				}
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}

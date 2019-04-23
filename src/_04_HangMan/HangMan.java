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
	static JTextField t1 = new JTextField();
	static String currentWord = "";
	static Stack<String> words = new Stack<String>();
	static int lives = 10;

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
		t1.setText(Integer.toString(lives));
		System.out.println(words.peek());
	}

	void JStuff() {
		f.add(p);
		p.add(t);
		p.add(t1);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		t.addKeyListener(this);
		t.setEditable(false);
		t1.setEditable(false);
		f.pack();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		//

	}

	@Override
	public void keyPressed(KeyEvent e) {
		//
		if (!words.peek().contains(Character.toString(e.getKeyChar()))) {
			lives -= 1;
			t1.setText(Integer.toString(lives));
			f.repaint();
		}

		if (lives < 1) {
			JOptionPane.showMessageDialog(null, "YOU LOOSE!!! XD LOL ;D");
		}

		for (int j = 0; j < words.peek().length(); j++) {

			if (currentWord.charAt(j) == '_') {
				if (words.peek().charAt(j) == e.getKeyChar()) {
					currentWord = currentWord.substring(0, j) + e.getKeyChar()
							+ currentWord.substring(j + 1, currentWord.length());
					System.out.println(currentWord);
					t.setText(currentWord);
				}
				if (currentWord.equals(words.peek())) {
					if (words.size() > 0) {
						words.pop();
						currentWord = "";
						for (int i = 0; i < words.peek().length(); i++) {
							currentWord += "_";
						}
					} else {
						JOptionPane.showMessageDialog(null, "YOU WIN!!!");
					}

				}

			}
		}
		f.pack();

	}

	@Override
	public void keyReleased(KeyEvent e) {
		//

	}

}

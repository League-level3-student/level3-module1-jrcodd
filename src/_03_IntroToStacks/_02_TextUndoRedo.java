package _03_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener {
	JPanel p = new JPanel();
	JFrame f = new JFrame();
	JLabel l = new JLabel();
	Stack<Character> deleted = new Stack<Character>();
	Stack<Character> current = new Stack<Character>();

	public static void main(String[] args) {
		_02_TextUndoRedo t = new _02_TextUndoRedo();
		t.JStuff();

	}

	/*
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look
	 * like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character
	 * is erased from the JLabel. Save that deleted character onto a Stack of
	 * Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed,
	 * the top Character is popped off the Stack and added back to the JLabel.
	 * 
	 */
	void JStuff() {

		p.add(l);
		f.add(p);
		f.addKeyListener(this);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.setSize(200, 100);
		f.setResizable(false);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		String currentText = l.getText();
		currentText += e.getKeyChar();
		l.setText(currentText);
		if (e.getKeyCode() == e.VK_BACK_SPACE) {
			deleted.push(current.pop());
			System.out.println(deleted);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}

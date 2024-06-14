package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener{

	public boolean upPressed, downPressed, leftPressed, rightPressed;

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();

		if (code == KeyEvent.VK_W) {
			// Move up
			upPressed = true;
		}
		if (code == KeyEvent.VK_S) {
			// Move down
			downPressed = true;
		}
		if (code == KeyEvent.VK_A) {
			// Move left
			leftPressed = true;
		}
		if (code == KeyEvent.VK_D) {
			// Move right
			rightPressed = true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// Stop movement
		if (e.getKeyCode() == KeyEvent.VK_W) {
			upPressed = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_S) {
			downPressed = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_A) {
			leftPressed = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_D) {
			rightPressed = false;
		}
		
	}

}

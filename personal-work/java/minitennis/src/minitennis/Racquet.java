/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minitennis;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class Racquet {
	private static final int Y = 330;
	private static final int WIDTH = 60;
	private static final int HEIGHT = 10;	// i just made them static to help with collison dection
        int x = 0;
	int xa = 0;
        
        // this is no y coordinates becasue the racquet cant move up or down
	private Game2 game;

	public Racquet(Game2 game) {
		this.game= game;
	}

	public void move() {
		if (x + xa > 0 && x + xa < game.getWidth()- WIDTH)
			x = x + xa;
	}

	public void paint(Graphics2D g) {
		g.fillRect(x, Y, WIDTH, HEIGHT); // this is the size of the rtacquet and we can change the size of it if needed
	}

	public void keyReleased(KeyEvent e) {
		xa = 0;
	}

	public void keyPressed(KeyEvent e) { // this decects keyboard input to move the paddle left or right
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
			xa = -game.speed; // this will make the ballmove faster depending on the level the player gets to
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
			xa = game.speed;
	}
        
        	public Rectangle getBounds() {
		return new Rectangle(x, Y, WIDTH, HEIGHT);
	}
                
                
public int getTopY() {
    return Y;
}
}
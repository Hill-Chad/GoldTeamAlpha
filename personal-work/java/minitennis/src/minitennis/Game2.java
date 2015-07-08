/*
 *http://www.edu4java.com/en/game/game1.html
 */
package minitennis;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import javax.swing.JFrame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Game2 extends JPanel {
    Ball ball = new Ball(this);
    Racquet racquet = new Racquet(this); // this calls in a new racquet
    int speed = 1; // this is the speed or level
    
    	private int getScore() {
		return speed - 1;
	}
    
    public Game2() throws MalformedURLException { // this adds a keyboard so we can take movement in and use it
		addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				racquet.keyReleased(e);
			}

			@Override
			public void keyPressed(KeyEvent e) {
				racquet.keyPressed(e);
			}
		});
		setFocusable(true);
                /*URL url3 = new URL("http://www.pkquality.com/Lindsey_Stirling_-_9m.wav");
		AudioClip BACK = Applet.newAudioClip(url3);
                BACK.loop();*/
	}
    
    
 private void ballMove1() throws Exception{
       ball.move();
       racquet.move(); // this now moves the racquet as well as the ball before it
    }

    
	@Override
	public void paint(Graphics gr) {
                super.paint(gr);
		Graphics2D g2d = (Graphics2D) gr;
                gr.setColor(Color.GREEN);
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, // this makes it look really pretty
				RenderingHints.VALUE_ANTIALIAS_ON);
		ball.paint(g2d);
                racquet.paint(g2d); // this adds the raquect and gives it color
                g2d.setColor(Color.GRAY);
		g2d.setFont(new Font("Verdana", Font.BOLD, 30));
		g2d.drawString(String.valueOf(getScore()), 10, 30);
	}
        public void gameOver() throws MalformedURLException {
            URL url2 = new URL("http://www.pkquality.com/game_over.wav");
            AudioClip GAMEOVER = Applet.newAudioClip(url2);
            GAMEOVER.play();
            
            JOptionPane.showMessageDialog(this, "Your Score Is: " + getScore(), "Game Over", JOptionPane.YES_NO_OPTION);
            System.exit(ABORT); // this will actually close the program otherwise you wont be able to close the program like i did
        }
	
public static void main(String[] args) throws InterruptedException, Exception {
		JFrame frame = new JFrame(" Chad's Mini Tennis");
                Game2 game1 = new Game2();
		frame.add(game1);
		frame.setSize(300, 400); // making it a little bigger
		frame.setVisible(true); // thios makes it visiable
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                
                while (true) { // this keeps it open while the ball is in motion
			game1.ballMove1(); // this runs the 2 threads independantly of each other so they can run at the same time
			game1.repaint();
                    try {
                        Thread.sleep(10); // this tells the processor to wait 10 miliseconds before running again
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
	}
}}
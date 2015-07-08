/*
 *http://www.edu4java.com/en/game/game1.html
 */
package minitennis;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class the_canvas_try2 extends JPanel {
    int x=0;
    int y=0;
    
    private void ballMove1(){
        x = x+1;
        y = y+1;
    }
    
    
    
	@Override
	public void paint(Graphics gr) {
                super.paint(gr);
		Graphics2D g2d = (Graphics2D) gr;
		g2d.setColor(Color.GREEN);
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, // this makes it look really pretty
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.fillRect(x, y, 30, 30);
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame(" Chad's Mini Tennis try 2");
                the_canvas_try2 game1 = new the_canvas_try2();
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
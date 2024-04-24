package space;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

/**
 * 
 */
public class Background extends JFrame{
	private int x = 400;
	private int y = 520;

	private static final long serialVersionUID = 1L;
	
	public Background() {
		setTitle("Galaga");
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyCode();
				if (key == KeyEvent.VK_LEFT) {
					if(x>15)
					x -= 20;
				} else if(key == KeyEvent.VK_RIGHT) {
					if(x<710)
					x +=20;
				}
				repaint();
			}
			
		});
		setVisible(true);
	}
	  @Override
	    public void paint(Graphics g) {
		  getContentPane().setBackground(Color.black);
	        super.paint(g);
	        // Dibuja el triángulo en la posición actual (x, y)
	        g.setColor(Color.WHITE);
	        int[] xPoints = {x, x + 40, x + 80};
	        int[] yPoints = {y + 80, y, y + 80};
	        g.fillPolygon(xPoints, yPoints, 3);
	    }

}

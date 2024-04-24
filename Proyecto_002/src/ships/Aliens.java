package ships;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

import interfaces_package.Drawable;

public class Aliens implements Drawable{
	
	JFrame frame = new JFrame();
	
	
	 public void paint(Graphics g) {
		  frame.getContentPane().setBackground(Color.black);
	        paint(g);
	        // Dibuja el triángulo en la posición actual (x, y)
	        g.setColor(Color.WHITE);
	        int[] xPoints = {x, x + 40, x + 80};
	        int[] yPoints = {y + 80, y, y + 80};
	        g.fillPolygon(xPoints, yPoints, 5);
	    }

	
}
	


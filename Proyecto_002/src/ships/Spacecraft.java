package ships;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

import interfaces_package.Deadble;
import interfaces_package.Drawable;
import interfaces_package.Mouble;
import interfaces_package.Shootable;

public class Spacecraft implements Drawable, Mouble, Deadble{
	
	JFrame frame;
	int x = 0;
	int y = 0;
	int xlife =180;
	
	public int getXlife() {
		return xlife;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	
	public Spacecraft(int x, int y, JFrame frame) {
		this.x = x;
		this.y = y;
		this.frame = frame;
	}
	

	@Override
	public void draw(Graphics g) {
	        // Dibuja el triángulo en la posición actual (x, y)
	        g.setColor(Color.WHITE);
	        int[] xPoints = {x, x + 40, x + 80};
	        int[] yPoints = {y + 80, y, y + 80};
	        g.fillPolygon(xPoints, yPoints, 3);
	        
	        g.setColor(Color.RED);
	        int[] xLifePoints = {10,xlife,xlife,10};
	        int[] yLifePoints = {10,10,50,50};
	        g.fillPolygon(xLifePoints, yLifePoints, 4);
        
	        
	        frame.setVisible(true);
		
	}

	@Override
	public void move() {
		frame.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyCode();
				if (key == KeyEvent.VK_LEFT) {
					if(x>15)
					x -= 10;
				} else if(key == KeyEvent.VK_RIGHT) {
					if(x<710)
					x +=10;
				}
				
			}
		});
		
	}

	@Override
	public void disaper(int lifeLost) {
		xlife -=lifeLost;
		
	}
	
	
}

package ships;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;

import interfaces_package.Drawable;
import interfaces_package.Mouble;
import interfaces_package.Shootable;

public class Bullet implements Drawable, Mouble, Shootable {
	
	
	JFrame frame;
	public int x;
	public int y;
	public boolean up;
	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}

	public Bullet(JFrame frame, int x, int y, boolean up) {
		this.frame = frame;
		this.x = x;
		this.y = y;
		this.up = up;
	}

	@Override
	public void move() {
		if (up) {
			y -= 20;
		}else {
			y += 20;
		}
	}

	@Override
	public void draw(Graphics g) {
		 g.setColor(Color.BLUE); 
	     g.fillOval(x, y, 10, 15);
	     frame.setVisible(true);
	}

	@Override
	public void shoot(ArrayList<Bullet> nw) {
		nw.add(this);
	}
	
}

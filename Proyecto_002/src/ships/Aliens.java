package ships;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Timer;
import javax.swing.JFrame;
import interfaces_package.Drawable;
import interfaces_package.Mouble;

public class Aliens implements Drawable, Mouble{
	
	JFrame frame;
	int x;
	int y;
	Timer time = new Timer();
	boolean end = false;
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}


	
	public Aliens(int x, int y, JFrame frame) {
		this.x = x;
		this.y = y;
		this.frame = frame;
	}		

	@Override
	public void draw(Graphics g) {
	        g.setColor(Color.GREEN);
	        int[] xPoints = {x, x + 80, x + 80, x+40, x};
	        int[] yPoints = {y, y, y + 80, y + 40, y + 80};
	        g.fillPolygon(xPoints, yPoints, 5);
	        frame.setVisible(true);
	}

	@Override
	public void move() {
		
		if(x>=650){
			end= true;
			y+=100;
		}
		if(x<=40) {
			end = false;
			y+=100;
		}
		if(end==false) {
			x += 10;
		}else if(end==true) {
			x -=10;
		}
		
	}

}
	


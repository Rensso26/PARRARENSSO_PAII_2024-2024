package ships;

import java.awt.Color;
import java.awt.Graphics;
import interfaces_package.Drawable;
import interfaces_package.MoubleX;


public class Spacecraft implements Drawable, MoubleX{
	int[] XPoints = {400,450,350};
	
	int[] YPoints = {500,550,550};
	
	
	public int getXPoints() {
		return XPoints[0];
	}


	public int getYPoints() {
		return YPoints[0];
	}


	@Override
	public void draw(Graphics g) {

		g.setColor(Color.WHITE);
		g.fillPolygon(XPoints, YPoints, 3);
	}


	@Override
	public void moveRigth(int distance) {
		for(int i = 0; i< XPoints.length; i++) {
			XPoints[i]= XPoints[i] + distance;
		}
		
	}


	@Override
	public void moveLeft(int distance) {
		for(int i = 0; i< XPoints.length; i++) {
			XPoints[i]= XPoints[i] - distance;
		}
		
	}
	
}
	
	

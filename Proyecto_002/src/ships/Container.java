package ships;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;

import interfaces_package.Deadble;
import interfaces_package.Drawable;
import interfaces_package.Mouble;
import interfaces_package.Shootable;

public class Container {
	
	
	public Container(Drawable dr, Graphics g) {
		dr.draw(g);
	}
	
	public Container(Mouble mv) {
		mv.move();
	}
	
	public Container(Shootable sh, ArrayList<Bullet> bl) {
		sh.shoot(bl);
	}
	
	public Container(Deadble dead, int lifeLost) {
		dead.disaper(lifeLost);
	}

}

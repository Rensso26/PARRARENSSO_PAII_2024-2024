package space;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.*;
import ships.Aliens;
import ships.Bullet;
import ships.Container;
import ships.Line;
import ships.Spacecraft;

/**
 * 
 */
public class Background extends JFrame{
	private Spacecraft j1 = new Spacecraft(360, 500, this);
	ArrayList<Aliens> alins = new ArrayList<>();
	private ArrayList<Bullet> bullets = new ArrayList<>();
	public boolean draw = false;
	Timer time = new Timer();
	public int score=0;
	

	private static final long serialVersionUID = 1L;
		
	public Background() {
		JFrame frame = this;
		setTitle("Galaga");
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setBackground(Color.black);
		setVisible(true);
		
		
		Container mov = new Container(j1);
	
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_SPACE) {
					Container blnew = new Container(new Bullet(frame, j1.getX()+32, j1.getY(),true), bullets);
					}
				}
			});
		time.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
					for(int xal=100; xal<=600 ;xal+=200) {
					alins.add(new Aliens(xal, 40, frame));
					}
				}
		},0 , 3000);
		time.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				repaint();	
			}
		},0 , 60);
		
		setVisible(true);
	}
	
	
	
	@Override
    public void paint(Graphics g) {
        super.paint(g); 
     
        JFrame frame = this;
        Container cont = new Container(new Line(frame), g);
        Container player = new Container(j1,g);
		
		
		for (Bullet bullet : bullets) {
			Container bldraw = new Container(bullet,g);
		}
		
		for (Aliens alien : alins) {
			Container ali = new Container(alien,g);
		}
		
		
        ArrayList<Bullet> bulletsToRemove = new ArrayList<>();
        ArrayList<Aliens> aliensToRemove = new ArrayList<>();
        
        for (Bullet bullet : bullets) {
        	for(Aliens aliend : alins) {
	            if (bullet.getY() < 0) { 
	                bulletsToRemove.add(bullet);
	            }else if((bullet.getY() >= aliend.getY() && bullet.getY() <= aliend.getY()+80)
	            	&& (bullet.getX()>=aliend.getX() && bullet.getX()<=aliend.getX()+80)) {
	            	bulletsToRemove.add(bullet);
	            	aliensToRemove.add(aliend);
	            	score += 10;
	          	}
	            
            }
        	
        }
        
        for(Aliens alienskills : alins) {
	        if(alienskills.getY()+80>= 402) {
				Container life= new Container(j1, 30);
	        	aliensToRemove.add(alienskills);
	        }
        }
        bullets.removeAll(bulletsToRemove);
        alins.removeAll(aliensToRemove);
        
		
		for(Bullet bullet : bullets) {
			Container bldraw = new Container(bullet);
		}
		for (Aliens alien : alins) {
			Container ali = new Container(alien);
		}
		
		
		if(j1.getXlife()==0) {
			time.cancel(); 
		    // Limpia las listas de balas y alienígenas
		    bullets.clear();
		    alins.clear();
		    // Desactiva la capacidad de la ventana para recibir eventos de teclado
		    setFocusable(false);
		    // Forzar un repintado de la ventana para limpiar la pantalla
		    repaint();
			g.drawString("GAME OVER", 360, 300);
		}
		
		g.setColor(Color.WHITE);
		g.drawString("Puntaje: " +score, 600, 50);
		
		 
	}

}

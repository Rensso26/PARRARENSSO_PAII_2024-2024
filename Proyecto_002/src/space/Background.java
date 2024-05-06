package space;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.*;

import Conteiner.Container;
import ships.Aliens;
import ships.Bullet;


/**
 * 
 */
public class Background extends JFrame implements KeyListener{

	ArrayList<Aliens> alins = new ArrayList<>();
	Container container;
	JPanel panel;
	

	private static final long serialVersionUID = 1L;
		
	public Background() {
		
		setTitle("Galaga");
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		container = new Container();
		panel= new JPanel();
		panel.setBackground(Color.black);
		setContentPane(panel);
		addKeyListener(this);
		
		Timer timer = new Timer(100, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				container.moveDown(1);
				repaint();
			}
		});
		timer.start();
		
		
		setVisible(true);

	}
	
	
	@Override
    public void paint(Graphics g) {
        super.paint(g);
        container.draw(g);
        
        addKeyListener(new KeyAdapter() {
		public void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {
			case KeyEvent.VK_SPACE : {
				container.drawShoot(g);
				System.out.println("hi");
				break;
			}
		}
		}
        }); 
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		setFocusable(true);
		switch (e.getKeyCode()) {
		case KeyEvent.VK_A : {
			container.moveLeft(10);
			break;
		}
		case KeyEvent.VK_D : {
			container.moveRight(10);
			break;
		}
		default:
			break;
		}
		repaint();
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}

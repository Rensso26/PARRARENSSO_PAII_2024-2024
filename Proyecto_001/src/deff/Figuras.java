package deff;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
*@author Parra Rensso
*Titulo: Inveri
*
*
 */


public class Figuras extends JFrame  {
	
		
	private JPanel  tr = new JPanel ();

    public Figuras() {
    	
    	//parametros de la venta
        setTitle("Figuras");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(300,200,800, 600);

        //panel para los botones
        JPanel panel = new JPanel();
        
        
        panel.setLayout(null);
        tr.setLayout(null);
        
        //primer boton
        JButton btn1 = new JButton("Triángulo");
        panel.add(btn1);
        btn1.setBounds(50, 50,100,50);
        //acción del boton
        
        btn1.addActionListener(new ActionListener() {
        	
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Graphics g = getGraphics();
			
				//borrar lo anterior
				 g.setColor(Color.WHITE);
				 int[] xPoints1 = { 800, 200, 200, 800 };
		            int[] yPoints1 = { 600, 600, 0, 0 };
		            g.fillPolygon(xPoints1, yPoints1, 4);
					tr.paint(g);
				
				 // Dibujar el triángulo
	            int[] xPoints = { 600, 400, 500 };
	            int[] yPoints = { 400, 400, 250 };
	            g.setColor(Color.RED);
	            g.fillPolygon(xPoints, yPoints, 3);
				tr.paint(g);
				
				
				
			}
		});
        
        
        
        //segundo boton
        JButton btn2 = new JButton("Cuadrado");
        panel.add(btn2);
        btn2.setBounds(50, 200,100,50);
        //acción del segundo boton
        btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Graphics g = getGraphics();
				//borrar lo anterior
				 g.setColor(Color.WHITE);
				 int[] xPoints1 = { 800, 200, 200, 800 };
		         int[] yPoints1 = { 600, 600, 0, 0 };
		         g.fillPolygon(xPoints1, yPoints1, 4);
					tr.paint(g);
				 // dibujar el cuadrado
	            int[] xPoints = { 600, 400, 400, 600 };
	            int[] yPoints = { 400, 400, 250, 250 };
	            g.setColor(Color.BLUE);
	            g.fillPolygon(xPoints, yPoints, 4);
				tr.paint(g);				
			}
		});
     

			
        JButton btn3 = new JButton("Circulo");
        panel.add(btn3);
        btn3.setBounds(50, 380,100,50);
       
        btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Graphics g = getGraphics();
				//borrar lo anterior
				g.setColor(Color.WHITE);
				int[] xPoints1 = { 800, 200, 200, 800 };
		        int[] yPoints1 = { 600, 600, 0, 0 };
		        g.fillPolygon(xPoints1, yPoints1, 4);
		        tr.paint(g);
		        //dibujar el circulo
				int diameter = Math.min(getWidth()/2, getHeight()/2) - 20;
		        int x = (getWidth() - diameter)/2;
		        int y = (getHeight() - diameter)/2 ;
		        g.setColor(Color.GREEN);
		        g.fillOval(x, y, diameter, diameter);
		        
				tr.paint(g);
				
			}
		});
        
        
        
        add(panel);
     
    }


	public static void main(String[] args) {
        Figuras ventana = new Figuras();
        ventana.setVisible(true);
    }

}


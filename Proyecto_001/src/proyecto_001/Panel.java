package proyecto_001;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.jogamp.opengl.*;
import com.jogamp.opengl.awt.*;

import renders.Circulo;
import renders.Cuadrado;
import renders.Triangulo;


/**
 * @author Parra Rensso
 * Titulo: Inversión de control
 */
public class Panel extends JFrame {

	private static final long serialVersionUID = 1L;
	
	//Instancias de las figuras usadas
    private Triangulo triangulo; 
    private Cuadrado cuadrado;
    private Circulo circulo; 

    
    public Panel() {
    	//Caracteristicas de la ventana creada
        setTitle("Figuras dibujadas con OpenGL"); //Nombre
        setSize(800, 600); // Tamaño 
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Termina el proceso al cerrar la ventana
        setLayout(null); // metodo para poder poner los objetos manualmente en la ventana
        
        
        // Crear el panel de OpenGL
        GLJPanel panelDraw = new GLJPanel();
        panelDraw.addGLEventListener(new GLEventListener() {
            
        	@Override
            public void init(GLAutoDrawable drawable) {}

            @Override
            public void dispose(GLAutoDrawable drawable) {}

            @Override
            public void display(GLAutoDrawable drawable) {
                // se usa OpenGl2
                GL2 gl = drawable.getGL().getGL2();
                // color del fondo de las figuras
                gl.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
                gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
                
                //metodos usados para borrar las figuras
                if (triangulo != null) {
                    triangulo.dibujar(drawable);
                }
                if (cuadrado != null) {
                    cuadrado.dibujar(drawable);
                }
                if (circulo != null) {
                    circulo.dibujar(drawable);
                }
            }

            @Override
            public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {}
        });
        panelDraw.setLayout(null);

        // Panel donde se situan los botones
        JPanel panelBtn = new JPanel();
        panelBtn.setLayout(null);
      
        
        
        
        // Boton 1
        JButton btn1 = new JButton("Triángulo");
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	// Borrar las figuras anteriores
            	  cuadrado = null;
                  circulo = null;
                // Sí la figura no ha sido creada, genera una instancia
                if (triangulo == null) {
                    
                    triangulo = new Triangulo(panelDraw);
                }
                // Dibujar la figura
                triangulo.dibujarTriangulo();
                panelDraw.repaint();
            }
        });
        // Agrega el botón al panle
        panelBtn.add(btn1); 
        // Posicionar el botón
        btn1.setBounds(25, 50,100,50);
        
        // Boton 2
        JButton btn2 = new JButton("Cuadrado");
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	// Borrar las figuras anteriores
            		triangulo = null;
            		circulo = null;
            	// Sí la figura no ha sido creada, genera una instancia
                if (cuadrado == null) {
                    cuadrado = new Cuadrado(panelDraw);
                }
                // Dibujar la figura
                cuadrado.dibujarCuadrado();
                panelDraw.repaint();
            }
        });
        // Agrega el botón al panel 
        panelBtn.add(btn2); 
        // Posicionar el botón
        btn2.setBounds(25, 200,100,50);
        
        // Boton 3
        JButton btn3 = new JButton("Círculo");
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	// Borrar las figuras anteriores
            		cuadrado = null;
            		triangulo = null;
            	
            		// Sí la figura no ha sido creada, genera una instancia
                if (circulo == null) {
                    circulo = new Circulo(panelDraw);
                }
                // Dibujar la figura
                circulo.dibujarCirculo();
                panelDraw.repaint();
            }
        });
        //Agregar el boón al panel
        panelBtn.add(btn3);
        // Posicionar el botón
        btn3.setBounds(25, 380,100,50);
        
        //Posicionar el panel de botones
        panelBtn.setBounds(0, 0,200,600);
        //Posicionar el panel de OpenGl
        panelDraw.setBounds(getWidth()-600, getHeight()-600, 550, 550);
        //Agregar los Paneles
        add(panelBtn);
        add(panelDraw);
        
        //Volverlos visibles
        setVisible(true); 
    }

   // Ejecutar el programa
    public static void main(String[] args) {
       Panel panel = new Panel();
      
    }
}

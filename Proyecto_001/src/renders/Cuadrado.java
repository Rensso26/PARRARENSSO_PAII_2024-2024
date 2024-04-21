package renders;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;

public class Cuadrado {
    private GLAutoDrawable drawable;
    private boolean dibujarCuadrado;

    // Constructor de la clase
    public Cuadrado(GLAutoDrawable drawable) {
        this.drawable = drawable;
        this.dibujarCuadrado = false;
    }

    // Metodo que dibuja la figura
    public void dibujarCuadrado() {
        dibujarCuadrado = true;
        drawable.display(); 
    }

    public void dibujar(GLAutoDrawable drawable) {
        final GL2 gl = drawable.getGL().getGL2();

        if (dibujarCuadrado) {
        	
        	// Color y vertices de la figutra
            gl.glBegin(GL2.GL_QUADS); 
            gl.glColor3f(0.0f, 0.0f, 1.0f); // Color 
            gl.glVertex2f(-0.5f, 0.5f); 
            gl.glVertex2f(0.5f, 0.5f); 
            gl.glVertex2f(0.5f, -0.5f); 
            gl.glVertex2f(-0.5f, -0.5f); 
            gl.glEnd();
        }
    }

}
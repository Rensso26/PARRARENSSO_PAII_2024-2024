package renders;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;

public class Triangulo {
    private GLAutoDrawable drawable;
    private boolean dibujarTriangulo;

    // Constructor de la clase
    public Triangulo(GLAutoDrawable drawable) {
        this.drawable = drawable;
        this.dibujarTriangulo = false;
    }

    // Metodo que dibuja la figura
    public void dibujarTriangulo() {
  
        dibujarTriangulo = true;
        drawable.display(); 
    }

    //vertices de la figura con su color
    public void dibujar(GLAutoDrawable drawable) {
        final GL2 gl = drawable.getGL().getGL2();

        if (dibujarTriangulo) {
            gl.glBegin(GL2.GL_TRIANGLES); 
            gl.glColor3f(1.0f, 0.0f, 0.0f); //color
            gl.glVertex2f(0.0f, 0.8f); 
            gl.glVertex2f(-0.8f, -0.8f); 
            gl.glVertex2f(0.8f, -0.8f); 
            gl.glEnd();
        }
    }



}

package renders;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;

public class Circulo {
    private GLAutoDrawable drawable;
    private boolean dibujarCirculo;

    // Constructor de la clase
    public Circulo(GLAutoDrawable drawable) {
        this.drawable = drawable;
        this.dibujarCirculo = false;
    }

    public void dibujarCirculo() {
  
        dibujarCirculo = true;
        drawable.display();
    }

    public void dibujar(GLAutoDrawable drawable) {
        final GL2 gl = drawable.getGL().getGL2();

        if (dibujarCirculo) {
        	//segmentos creados dentro del circulo
            int numSegments = 80; 

            gl.glBegin(GL2.GL_TRIANGLE_FAN); 
            gl.glColor3f(0.0f, 1.0f, 0.0f); // Color 

            // Centrando el circulo
            gl.glVertex2f(0.0f, 0.0f); 

            // Calculo de los vertices
            for (int i = 0; i <= numSegments; i++) {
                double angle = 2.0 * Math.PI * i / (numSegments);
                float x = (float) Math.cos(angle);
                float y = (float) Math.sin(angle);
                gl.glVertex2f(x, y);
            }

            gl.glEnd();
        }
    }

}
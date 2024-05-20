package ec.uce.edu.models;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("enemy")
public class Enemy extends Role implements Drawable{

    private int life;
    private int rewild;

    public Enemy(){super(5);}

    public Enemy(int life, int rewild) {
        this.life = life;
        this.rewild = rewild;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getRewild() {
        return rewild;
    }

    public void setRewild(int rewild) {
        this.rewild = rewild;
    }

    @Override
    public void draw() {
        System.out.println("Dibujo de enemigo con " +this.getCoordX().length + " puntos");
    }
}

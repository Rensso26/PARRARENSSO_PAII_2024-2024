package ec.uce.edu.models;

import org.springframework.stereotype.Service;

@Service
public class Hero extends Role implements Drawable{

    private String name;
    private int life;
    private int score;

    public Hero() {
        super(3);
    }
    public Hero(String name, int life, int score){
        this.name = name;
        this.life = life;
        this.score = score;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public void draw() {
        System.out.println("Dibujo de mi heroe con " + this.getCoordX().length + " puntos");
    }
}

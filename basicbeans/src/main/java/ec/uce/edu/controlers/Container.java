package ec.uce.edu.controlers;

import ec.uce.edu.models.Drawable;
import ec.uce.edu.models.Enemy;
import ec.uce.edu.models.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Container {
    @Autowired
    Drawable hero;
    @Autowired
    Drawable enemy;

    public Container(){

    }

    public void draw(){
        System.out.println("Aqui inicio a dibujar el container");
        this.hero.draw();
        this.enemy.draw();
    }

}

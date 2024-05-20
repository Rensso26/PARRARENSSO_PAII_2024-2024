package ec.uce.edu.controlers;

import ec.uce.edu.models.Drawable;
import ec.uce.edu.models.Enemy;
import ec.uce.edu.models.Hero;
import jdk.jfr.Name;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Controller;

@Controller
public class Container {
    @Qualifier("hero")
    @Autowired
    Drawable hero;


    @Qualifier("enemy")
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

package ec.edu.uce.BasicJPA;

import ec.edu.uce.BasicJPA.models.Person;
import jakarta.annotation.Generated;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicJpaApplication.class, args);
		Person person = new Person("Fredy","Tapia",12);

	}

}

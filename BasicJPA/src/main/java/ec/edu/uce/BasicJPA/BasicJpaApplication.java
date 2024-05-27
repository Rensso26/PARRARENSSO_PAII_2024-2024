package ec.edu.uce.BasicJPA;

import ec.edu.uce.BasicJPA.models.Person;
import ec.edu.uce.BasicJPA.services.PersonService;
import jakarta.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.naming.Context;
import java.util.List;

@SpringBootApplication
public class BasicJpaApplication implements CommandLineRunner {
	@Autowired
	PersonService service;
	public static void main(String[] args) {
		SpringApplication.run(BasicJpaApplication.class, args);
//		Person person = new Person("Fredy","Tapia",12);
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//		ctx.getBean(PersonService.class);
//		PersonService personService = ctx.getBean(PersonService.class);
//		personService.save(new Person("Make","trez",21));


	}

	@Override
	public void run(String... args) throws Exception {
		service.save(new Person(1,"make","Rut",23));
		service.save(new Person(2,"nate","Rut",26));
		service.save(new Person(3,"jame","Rut",27));
		service.save(new Person(4,"arthur","Rut",30));
		service.save(new Person(5,"walter","Rut",55));

		//metodo para leer la tabla

		for(Person person : service.read()){
			System.out.println(person.toString());
		}
	}
}

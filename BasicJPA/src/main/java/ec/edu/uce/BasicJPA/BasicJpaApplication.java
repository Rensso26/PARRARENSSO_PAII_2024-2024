package ec.edu.uce.BasicJPA;

import ec.edu.uce.BasicJPA.models.Person;
import ec.edu.uce.BasicJPA.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class BasicJpaApplication  implements CommandLineRunner {
	@Autowired
	PersonServices services;

	public static void main(String[] args) {
		SpringApplication.run(BasicJpaApplication.class,args);
	}

	@Override
	public void run(String... args) throws Exception {
		services.save(new Person(1,"Fredy","Tapia",24));
		services.save(new Person(2,"Emil","Verkade",22));
		services.save(new Person(3,"Joel","Luna",23));
		services.save(new Person(4,"Kevin","Pozo",22));
		services.save(new Person(5,"Brayan","Loya",23));

//		List<Person> personList = services.findAll();
//		for (Person personlist : personList){
//			System.out.println(personlist);
//		}
		List<Person> busqueda = services.findByName("Kevin");
		System.out.println(busqueda);

		List<Person> busqueda2 = services.findByLastName("Loya");
		System.out.println(busqueda2);
	}
}

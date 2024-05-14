package ec.uce.edu.basicbeans;

import ec.uce.edu.clases.Persona;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BasicbeansApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicbeansApplication.class, args);

		BeanFactory factory = new ClassPathXmlApplicationContext("file:src/main/resources/personabeans.xml");
		System.out.println(factory.getBean("Persona1"));
	}

}

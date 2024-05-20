package ec.uce.edu;

import ec.uce.edu.models.Hero;
import ec.uce.edu.controlers.Container;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//@ComponentScan(basePackages = {"ec.uce.edu.models", "ec.uce.edu.basicbeans"})
public class BasicbeansApplication {

	public static void main(String[] args) {
		//System.setProperty("server.servlet.context-path","/appi/v1");
		//SpringApplication.run(BasicbeansApplication.class,args);
		ApplicationContext context = SpringApplication.run(BasicbeansApplication.class, args);

		Container container1 = context.getBean(Container.class);
		container1.draw();

		/**
		BeanFactory factory = new ClassPathXmlApplicationContext("file:src/main/resources/personabeans.xml");
		System.out.println(factory.getBean("Persona1"));
		 **/
	}

}

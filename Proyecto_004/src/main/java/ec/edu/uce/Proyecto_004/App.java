package ec.edu.uce.Proyecto_004;

import java.sql.Time;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.Horarios;
import models.Materia;
import models.Professor;
import models.Student;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        
        configuration.addAnnotatedClass(Student.class);
        configuration.addAnnotatedClass(Professor.class);
        configuration.addAnnotatedClass(Materia.class);
        configuration.addAnnotatedClass(Horarios.class);
        
        // Create Session Factory and auto-close with try-with-resources.
        try (SessionFactory sessionFactory = configuration.buildSessionFactory()) {
 
            Session session = sessionFactory.openSession();
            /**
            Student student = new Student();
            student.setId(1);
            student.setName("Joel");
            student.setLastname("Puto");
            student.setAge(23);
            session.persist(student); 
             **/
            /**
            Professor professor = new Professor();
            professor.setId(1);
            professor.setName("Richard");
            professor.setLastname("Feynman");
            professor.setAge(64);
            session.persist(professor);
             **/
            /**
            Materia materia = new Materia();
            materia.setId(1);
            materia.setName("Actuaria");
            materia.setDescrition("una wea de matematicas");
            materia.setLevel(8);
            session.persist(materia);
            **/
            /**
            Horarios horario = new Horarios();
            horario.setId_mat(1);
            horario.setId_alumno(1);
            horario.setId_profesor(1);
            horario.setHora_inicio(Time.valueOf("08:00:00"));
            horario.setHora_fin(Time.valueOf("10:00:00"));
            session.persist(horario);
            **/
            session.beginTransaction();
            session.getTransaction().commit();
        }
    }
}

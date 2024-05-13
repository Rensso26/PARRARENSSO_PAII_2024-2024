package frame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.Horarios;
import models.Materia;
import models.Professor;
import models.Student;

public class Screen extends JFrame{
	private JButton btnVentana1, btnVentana2, btnVentana3, btnVentana4;
    private JFrame ventana1, ventana2, ventana3, ventana4;
    public JTextField textFieldVentana1, textFieldVentana2, textFieldVentana3, hora_ent, hora_sal;
    public JSpinner id1, edad, lvl,id_prof, id_mat, id_stud;

  
    public Student student = new Student() ;
    public Professor profesor =  new Professor();
    public Materia materia = new Materia();
    public Horarios horario = new Horarios();
        
    
    
    
    public Screen() {
    	
    	Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        
        configuration.addAnnotatedClass(Student.class);
        configuration.addAnnotatedClass(Professor.class);
        configuration.addAnnotatedClass(Materia.class);
        configuration.addAnnotatedClass(Horarios.class);
        
    	setTitle("Ventana principal");
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setSize(400,400);
    	setLocationRelativeTo(null);
    	
    	btnVentana1 = new JButton("Estudiantes");
        btnVentana2 = new JButton("Profesores");
        btnVentana3 = new JButton("Materias");
        btnVentana4 = new JButton("Horarios");
    	
        btnVentana1.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				ventana1 = new JFrame("Estudiantes");
				ventana1.setLayout(new FlowLayout());
				id1 = new JSpinner(new SpinnerNumberModel(0,0,10000,1));
				edad = new JSpinner(new SpinnerNumberModel(0,0,80,1));
				JLabel lblid = new JLabel("ID:");
				JLabel lblNombre = new JLabel("Nombre:");
				JLabel lblApellido = new JLabel("Apellido:");
				JLabel lblEdad = new JLabel("Edad:");
				textFieldVentana1 = new JTextField(5);
				textFieldVentana2 = new JTextField(5);
				ventana1.add(lblid);
				ventana1.add(id1);
				ventana1.add(lblNombre);
				ventana1.add(textFieldVentana1);
				ventana1.add(lblApellido);
				ventana1.add(textFieldVentana2);
				ventana1.add(lblEdad);
				ventana1.add(edad);
				JButton agregarBtn = new JButton("Agregar");
				agregarBtn.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						 try (SessionFactory sessionFactory = configuration.buildSessionFactory()) {
						Session session = sessionFactory.openSession();
						String nombre = textFieldVentana1.getText();
						String apellido = textFieldVentana2.getText();
						int id = (int) id1.getValue();
						int age = (int) edad.getValue();
			            student.setName(nombre);
			            student.setLastname(apellido);
			            student.setId(id);
			            student.setAge(age);
			            session.beginTransaction();
			            session.persist(student); 
			            session.getTransaction().commit();
						 }  
					}
				});
				ventana1.add(agregarBtn);
				ventana1.setSize(600,400);
				ventana1.setLocationRelativeTo(null);
				ventana1.setVisible(true);
			}
		});
        
        btnVentana2.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				ventana2 = new JFrame("Profesores");
				ventana2.setLayout(new FlowLayout());
				id1 = new JSpinner(new SpinnerNumberModel(0,0,10000,1));
				edad = new JSpinner(new SpinnerNumberModel(0,0,80,1));
				JLabel lblid = new JLabel("ID:");
				JLabel lblNombre = new JLabel("Nombre:");
				JLabel lblApellido = new JLabel("Apellido:");
				JLabel lblEdad = new JLabel("Edad:");
				textFieldVentana1 = new JTextField(5);
				textFieldVentana2 = new JTextField(5);
				ventana2.add(lblid);
				ventana2.add(id1);
				ventana2.add(lblNombre);
				ventana2.add(textFieldVentana1);
				ventana2.add(lblApellido);
				ventana2.add(textFieldVentana2);
				ventana2.add(lblEdad);
				ventana2.add(edad);
				JButton agregarBtn = new JButton("Agregar");
				agregarBtn.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						 try (SessionFactory sessionFactory = configuration.buildSessionFactory()) {
						Session session = sessionFactory.openSession();
						String nombre = textFieldVentana1.getText();
						String apellido = textFieldVentana2.getText();
						int id = (int) id1.getValue();
						int age = (int) edad.getValue();
			            profesor.setName(nombre);
			            profesor.setLastname(apellido);
			            profesor.setId(id);
			            profesor.setAge(age);
			            session.beginTransaction();
			            session.persist(profesor); 
			            session.getTransaction().commit();
						 }  
					}
				});
				ventana2.add(agregarBtn);
				ventana2.setSize(600,400);
				ventana2.setLocationRelativeTo(null);
				ventana2.setVisible(true);
			}
		});
        
        btnVentana3.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				ventana3 = new JFrame("Materia");
				ventana3.setLayout(new FlowLayout());
				id1 = new JSpinner(new SpinnerNumberModel(0,0,10000,1));
				lvl = new JSpinner(new SpinnerNumberModel(0,0,80,1));
				JLabel lblid = new JLabel("ID:");
				JLabel lblNombre = new JLabel("Nombre:");
				JLabel lblDescripcion = new JLabel("Descripcion:");
				JLabel lblEdad = new JLabel("lvl:");
				textFieldVentana1 = new JTextField(5);
				textFieldVentana2 = new JTextField(500);
				ventana3.add(lblid);
				ventana3.add(id1);
				ventana3.add(lblNombre);
				ventana3.add(textFieldVentana1);
				ventana3.add(lblDescripcion);
				ventana3.add(textFieldVentana2);
				ventana3.add(lblEdad);
				ventana3.add(lvl);
				JButton agregarBtn = new JButton("Agregar");
				agregarBtn.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						 try (SessionFactory sessionFactory = configuration.buildSessionFactory()) {
						Session session = sessionFactory.openSession();
						String nombre = textFieldVentana1.getText();
						String descripcion = textFieldVentana2.getText();
						int id = (int) id1.getValue();
						int nivel = (int) lvl.getValue();
			            materia.setName(nombre);
			            materia.setDescrition(descripcion);
			            materia.setId(id);
			            materia.setLevel(nivel);
			            session.beginTransaction();
			            session.persist(materia); 
			            session.getTransaction().commit();
						 }  
					}
				});
				ventana3.add(agregarBtn);
				ventana3.setSize(600,400);
				ventana3.setLocationRelativeTo(null);
				ventana3.setVisible(true);
			}
		});
        
        btnVentana4.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				ventana4 = new JFrame("Horarios");
				ventana4.setLayout(new FlowLayout());
				
				
				
				id_mat = new JSpinner(new SpinnerNumberModel(0,0,10000,1));
				id_stud = new JSpinner(new SpinnerNumberModel(0,0,10000,1));
				id_prof = new JSpinner(new SpinnerNumberModel(0,0,10000,1));
				
				hora_ent = new JTextField(10);
				hora_sal = new JTextField(10);
				

				lvl = new JSpinner(new SpinnerNumberModel(0,0,80,1));
				JLabel lblid_mat = new JLabel("ID Materia:");
				JLabel lblid_std = new JLabel("ID Estudiante:");
				JLabel lbid_prof = new JLabel("ID Profesor:");
				JLabel Hora_entrada = new JLabel("Hora de entrada:");
				JLabel Hora_salida = new JLabel("Hora de salida:");
				
				textFieldVentana1 = new JTextField(5);
				textFieldVentana2 = new JTextField(500);
				ventana4.add(lblid_mat);
				ventana4.add(id_mat);
				ventana4.add(lblid_std);
				ventana4.add(id_stud);
				ventana4.add(lbid_prof);
				ventana4.add(id_prof);
				ventana4.add(Hora_entrada);
				ventana4.add(hora_ent);
				ventana4.add(Hora_salida);
				ventana4.add(hora_sal);
				
				JButton agregarBtn = new JButton("Agregar");
				agregarBtn.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						 try (SessionFactory sessionFactory = configuration.buildSessionFactory()) {
						Session session = sessionFactory.openSession();
						String nombre = textFieldVentana1.getText();
						String descripcion = textFieldVentana2.getText();
						int id_mate = (int) id_mat.getValue();
						int id_stude = (int) id_stud.getValue();
						int id_profe = (int) id_prof.getValue();
						Time Hora_entra = (Time) ((SpinnerModel) hora_ent).getValue();
						Time Hora_sali = (Time) ((SpinnerModel) hora_sal).getValue();
			            horario.setId_mat(id_mate);
			            horario.setId_alumno(id_stude);
			            horario.setId_profesor(id_profe);
			            horario.setHora_inicio(Hora_entra);
			            horario.setHora_fin(Hora_sali);
			            
			            
			            session.beginTransaction();
			            session.persist(horario); 
			            session.getTransaction().commit();
						 }  
					}
				});
				ventana4.add(agregarBtn);
				ventana4.setSize(600,400);
				ventana4.setLocationRelativeTo(null);
				ventana4.setVisible(true);
			}
		});
        
        JPanel panel = new JPanel();
        panel.add(btnVentana1);
        panel.add(btnVentana2);
        panel.add(btnVentana3);
        panel.add(btnVentana4);
        
        add(panel);
    
    }
    

}

package default_package;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Time;

import conection.MysqlConnectionFactory;
import interfaces.ConnectionFactory;

/**
 * @author Parra Rensso
 * Titulo: Coneccion a base de datos
 */

public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		
		ConnectionFactory factory = new MysqlConnectionFactory("jdbc:mysql://localhost:3306/instituto", "root", "root");
		
		
		 try {
	            // Obtener una conexión usando la factoría
	            Connection connection = factory.getConnection();
	            
	            
	            
	            DAOAlumno alumno = new DAOAlumno(connection);
	            
	            alumno.create(new Alumno(1, "Juancarlos", "Bodoque", 32));
	            alumno.read(1);
	            alumno.update(new Alumno(1, "Tulio", "Triviño", 45));
	            alumno.read(1);
	            alumno.delete(1);
	            alumno.read(1);
	            
	            DAOProfesor profesor = new DAOProfesor(connection);
	            
	            profesor.create(new Profesor(1, "Patana", "Patracia", 22));
	            profesor.read(1);
	            profesor.update(new Alumno(1, "Mico", "Microfono", 28));
	            profesor.read(1);
	            profesor.delete(1);
	            profesor.read(1);
	            
	            DAOMateria materia = new DAOMateria(connection);
	         
	            materia.create(new Materia(1, "Television", "Aprender a crear un noticiero de duracion de 31 minutos", 3));
	            materia.read(1);
	            materia.update(new Materia(1, "Mimica", "Aprender a actuar con marionetas", 3));
	            materia.read(1);
	            materia.delete(1);
	            materia.read(1);
	            
	            
	            connection.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
		
	/**	
		try {
		
		ResultSet result = statement.executeQuery("SELECT * FROM person");
		while(result.next())
			System.out.println("Persona: " + result.getString("name"));
		
		statement.execute("UPDATE person SET age=35 WHERE id =1");
		
		statement.execute("DELETE FROM person WHERE id=2");
		
		//CRUD
		
		
		statement.close();
		connection.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
				
	 **/
	}
	
	
}

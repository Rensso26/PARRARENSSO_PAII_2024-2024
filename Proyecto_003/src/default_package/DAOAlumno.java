package default_package;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import interfaces.IDAO;
import interfaces.IEntidades;

public class DAOAlumno implements IDAO{
	
	Connection connection = null;
	
	public DAOAlumno(Connection connection) {
		this.connection = connection;
	}
	

	@Override
	public void create(IEntidades alumno) throws SQLException {
		
		PreparedStatement ps = connection.prepareStatement("INSERT INTO alumno VALUES (?,?,?,?)");
		ps.setInt(1, alumno.getId());
		ps.setString(2, alumno.getName());
		ps.setString(3, alumno.getLastname());
		ps.setInt(4, alumno.getAge());
		ps.execute();
		
	}



	@Override
	public void read(int id) throws SQLException {
		PreparedStatement ps = connection.prepareStatement("SELECT name, lastname, age FROM alumno WHERE id = ?");
	    ps.setInt(1, id);

	    ResultSet result = ps.executeQuery();
	        // Verificar si hay al menos una fila en el ResultSet
	        if (result.next()) {
	            String name = result.getString("name");
	            String lastname = result.getString("lastname");
	            int age = result.getInt("age");

	            System.out.println("Name: " + name);
	            System.out.println("Lastname: " + lastname);
	            System.out.println("Age: " + age);
	        } else {
	            System.out.println("No se encontró ningún alumno con el ID proporcionado.");
	        
	    }
	}



	@Override
	public void update(IEntidades alumno) throws SQLException {

		PreparedStatement ps = connection.prepareStatement("UPDATE alumno SET name = ?, lastname = ?, age = ? WHERE id = ?");
		ps.setString(1, alumno.getName());
		ps.setString(2, alumno.getLastname());
		ps.setInt(3, alumno.getAge());
		ps.setInt(4, alumno.getId());
		ps.execute();
		

		
	}



	@Override
	public void delete(int id) throws SQLException {
		
		PreparedStatement ps = connection.prepareStatement("DELETE FROM alumno WHERE id = ?");
		ps.setInt(1, id);
		ps.execute();
		
	}

	
}

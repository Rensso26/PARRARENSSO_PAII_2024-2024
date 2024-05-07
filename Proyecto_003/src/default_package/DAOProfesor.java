package default_package;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import interfaces.IDAO;
import interfaces.IEntidades;

public class DAOProfesor implements IDAO{
	
	Connection connection = null;

	public DAOProfesor(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void create(IEntidades profesor) throws SQLException {
		PreparedStatement ps = connection.prepareStatement("INSERT INTO profesor VALUES (?,?,?,?)");
		ps.setInt(1, profesor.getId());
		ps.setString(2, profesor.getName());
		ps.setString(3, profesor.getLastname());
		ps.setInt(4, profesor.getAge());
		ps.execute();
		
		
	}

	@Override
	public void read(int id) throws SQLException {
		PreparedStatement ps = connection.prepareStatement("SELECT name, lastname, age FROM profesor WHERE id = ?");
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
	            System.out.println("No se encontró ningún profesor con el ID proporcionado.");
	        
	    }
		
	}

	@Override
	public void update(IEntidades profesor) throws SQLException {

		PreparedStatement ps = connection.prepareStatement("UPDATE profesor SET name = ?, lastname = ?, age = ? WHERE id = ?");
		ps.setString(1, profesor.getName());
		ps.setString(2, profesor.getLastname());
		ps.setInt(3, profesor.getAge());
		ps.setInt(4, profesor.getId());
		ps.execute();
		
	}

	@Override
	public void delete(int id) throws SQLException {
		PreparedStatement ps = connection.prepareStatement("DELETE FROM profesor WHERE id = ?");
		ps.setInt(1, id);
		ps.execute();
		
	}

}

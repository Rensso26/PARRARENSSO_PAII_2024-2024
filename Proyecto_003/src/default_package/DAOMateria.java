package default_package;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import interfaces.IDAO;
import interfaces.IEntidades;

public class DAOMateria implements IDAO{

	Connection connection = null;
	
	public DAOMateria(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void create(IEntidades materia) throws SQLException {
		PreparedStatement ps = connection.prepareStatement("INSERT INTO materias VALUES (?,?,?,?)");
		ps.setInt(1, materia.getId());
		ps.setString(2, materia.getName());
		ps.setString(3, materia.getLastname());
		ps.setInt(4, materia.getAge());
		ps.execute();
		
		
	}

	@Override
	public void read(int id) throws SQLException {
		PreparedStatement ps = connection.prepareStatement("SELECT name, description, level FROM materias WHERE id = ?");
	    ps.setInt(1, id);

	    ResultSet result = ps.executeQuery();
	        // Verificar si hay al menos una fila en el ResultSet
	        if (result.next()) {
	            String name = result.getString("name");
	            String description = result.getString("description");
	            int age = result.getInt("level");

	            System.out.println("Name: " + name);
	            System.out.println("Description: " + description);
	            System.out.println("level: " + age);
	        } else {
	            System.out.println("No se encontró ninguna materia con el ID proporcionado.");
	        
	    }
		
	}

	@Override
	public void update(IEntidades materia) throws SQLException {
		PreparedStatement ps = connection.prepareStatement("UPDATE materias SET name = ?, description = ?, level = ? WHERE id = ?");
		ps.setString(1, materia.getName());
		ps.setString(2, materia.getLastname());
		ps.setInt(3, materia.getAge());
		ps.setInt(4, materia.getId());
		ps.execute();
		
	}

	@Override
	public void delete(int id) throws SQLException {
		PreparedStatement ps = connection.prepareStatement("DELETE FROM materias WHERE id = ?");
		ps.setInt(1, id);
		ps.execute();
		
	}

}

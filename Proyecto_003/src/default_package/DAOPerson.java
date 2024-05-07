package default_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import interfaces.IDAO;
import interfaces.IEntidades;

public class DAOPerson implements IDAO{
	Connection connection = null;
	public DAOPerson(Connection connection) {
		this.connection = connection;
	}

	public void closeConnection() throws SQLException {
		if(connection != null)
			connection.close();
	}
	public void createPerson(Person person) throws SQLException {

		PreparedStatement ps = connection.prepareStatement(null);
		Statement statement = connection.createStatement();
		statement.execute("INSERT INTO person VALUES (?,?,?)");
		ps.setInt(3, person.getAge());
		ps.execute();
		
	}
	

	@Override
	public void create(IEntidades entidad) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void read(int id) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(IEntidades entidad) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
}

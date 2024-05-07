package default_package;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import interfaces.IDAOH;
import interfaces.IHorarios;

public class DAOHorario implements IDAOH{
	
	Connection connection = null;
	
	
	public DAOHorario(Connection connection) {
	
		this.connection = connection;
	}

	@Override
	public void create(IHorarios horario) throws SQLException {
		PreparedStatement ps = connection.prepareStatement("INSERT INTO profesor VALUES (?,?,?,?,?,?)");
		ps.setInt(1, horario.getId_mat());
		ps.setInt(2, horario.getId_alumno());
		ps.setInt(3, horario.getId_profesor());
		ps.setTime(4, horario.getHora_inicio());
		ps.setTime(5, horario.getHora_fin());
		ps.setString(6, horario.getDia());
		ps.execute();
		
		
	}

	@Override
	public void read(int id) throws SQLException {
		PreparedStatement ps = connection.prepareStatement("SELECT hora_inicio, hora_fin, id_mat FROM horarios WHERE id_mat = ?");
	    ps.setInt(1, id);

	    ResultSet result = ps.executeQuery();
	        
	        if (result.next()) {
	            String hora_inicio = result.getString("hora_inicio");
	            String hora_fin = result.getString("hora_fin");
	            int id_mat = result.getInt("id_mat");

	            System.out.println("Hora Inicio: " + hora_inicio);
	            System.out.println("Hora Fin: " + hora_fin);
	            System.out.println("Id Materia: " + id_mat);
	        } else {
	            System.out.println("No se encontró ninguna materia con el ID proporcionado.");
	        
	    }
		
	}

	@Override
	public void update(IHorarios horario) throws SQLException {
		PreparedStatement ps = connection.prepareStatement("UPDATE horario SET "
				+ "id_alumno = ?, id_profesor = ?, hora_inicio = ?, hora_fin = ?, dia = ? WHERE id_mat = ?");
		ps.setInt(1, horario.getId_alumno());
		ps.setInt(2, horario.getId_profesor());
		ps.setTime(3, horario.getHora_inicio());
		ps.setTime(4, horario.getHora_fin());
		ps.setString(5, horario.getDia());
		ps.setInt(6, horario.getId_mat());
		ps.execute();
		
	}

	@Override
	public void delete(int id) throws SQLException {
		PreparedStatement ps = connection.prepareStatement("DELETE FROM horario WHERE id = ?");
		ps.setInt(1, id);
		ps.execute();
		
	}

	

}

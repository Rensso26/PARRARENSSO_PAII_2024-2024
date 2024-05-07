package interfaces;

import java.sql.SQLException;

public interface IDAO {
	public void create(IEntidades entidad)throws SQLException;
	public void read(int id)throws SQLException;
	public void update(IEntidades entidad)throws SQLException;
	public void delete(int id)throws SQLException;
}

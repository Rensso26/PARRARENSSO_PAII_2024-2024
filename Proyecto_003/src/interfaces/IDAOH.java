package interfaces;

import java.sql.SQLException;

public interface IDAOH {
	
		public void create(IHorarios entidad)throws SQLException;
		public void read(int id)throws SQLException;
		public void update(IHorarios entidad)throws SQLException;
		public void delete(int id)throws SQLException;
}

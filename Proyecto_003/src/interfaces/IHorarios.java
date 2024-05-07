package interfaces;

import java.sql.Time;

public interface IHorarios {

	public int getId_mat();
	public int getId_alumno();
	public int getId_profesor();
	public Time getHora_inicio();
	public Time getHora_fin();
	public String getDia();
}

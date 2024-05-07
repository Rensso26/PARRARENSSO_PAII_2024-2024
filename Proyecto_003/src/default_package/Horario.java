package default_package;

import java.sql.Time;

import interfaces.IHorarios;

public class Horario implements IHorarios{
	int id_mat;
	int id_alumno;
	int id_profesor;
	Time horaInicio;
	Time horaFin;
	String dia;
	
	

	public Horario(int id_mat, int id_alumno, int id_profesor, Time horaInicio, Time horaFin, String dia) {
		super();
		this.id_mat = id_mat;
		this.id_alumno = id_alumno;
		this.id_profesor = id_profesor;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.dia = dia;
	}
	
	

	@Override
	public int getId_mat() {
		// TODO Auto-generated method stub
		return id_mat;
	}

	@Override
	public int getId_alumno() {
		// TODO Auto-generated method stub
		return id_alumno;
	}

	@Override
	public int getId_profesor() {
		// TODO Auto-generated method stub
		return id_profesor;
	}

	@Override
	public Time getHora_inicio() {
		// TODO Auto-generated method stub
		return horaInicio;
	}

	@Override
	public Time getHora_fin() {
		// TODO Auto-generated method stub
		return horaFin;
	}

	@Override
	public String getDia() {
		// TODO Auto-generated method stub
		return dia;
	}

}

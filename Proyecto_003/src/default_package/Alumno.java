package default_package;

import interfaces.IEntidades;

public class Alumno implements IEntidades{
	int id;
	String name;
	String lastname;
	int age;
	
	public Alumno(int id, String name, String lastname, int age) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getLastname() {
		return lastname;
	}
	public int getAge() {
		return age;
	}
	
}

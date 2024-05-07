package default_package;

import interfaces.IEntidades;

public class Materia implements IEntidades{
	
	int id;
	String name;
	String description;
	int age;
	public Materia(int id, String name, String description, int age) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	@Override
	
	public String getLastname() {
		return description;
	}

	
}

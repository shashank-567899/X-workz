package com.springboot.first.app;

public class Student {
	private String name;
	private String lastName;
	
	
	public Student(String name, String lastName) {
		super();
		this.name = name;
		this.lastName = lastName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

}

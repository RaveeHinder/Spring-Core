package com.learn.spring.DI;

public class Student implements Human {

	private String name;
	private int id;

//	@Override
//	public void setName(String name) {
//		this.name = name;
//
//	}
//
//	@Override
//	public void setId(int id) {
//		this.id = id;
//	}
	
	
	// Setter method
	

	@Override
	public void studentInfo() {
		System.out.println("Student name is " + name + " and id is " + id);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

}

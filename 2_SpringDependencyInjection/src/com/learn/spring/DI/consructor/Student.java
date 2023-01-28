package com.learn.spring.DI.consructor;

import org.springframework.util.StringUtils;

public class Student implements Human {

	private String name;
	private int id;

	
	
	

	@Override
	public void studentInfo() {
		if(StringUtils.isEmpty(this.name) ||  StringUtils.isEmpty(this.id)) {
			throw new NullPointerException("Name or Id is Null...");
		}
		System.out.println("Student name is " + name + " and id is " + id);
	}

	// Constructor injection
	public Student(String name, int id) {
//		super();
		this.name = name;
		this.id = id;
	}


	// Constructor injection
	public Student(int id) {
		this.id = id;
	}
	
	// Constructor injection
	public Student(String name) {
		this.name = name;
	}
}

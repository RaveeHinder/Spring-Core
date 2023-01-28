package com.learn.spring.injectBy.PropertyValues;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("${studentOne.name}")
	private String name;
	@Value("${studentOne.course}")
	private String course;
	@Value("${studentOne.hobby}")
	private String hobby;

// No need to add setter as we added in the fields 
	
//	public void setName(String name) {
//		this.name = name;
//		System.out.println("setter - name");
//	}
//	
//	public void setCourse(String course) {
//		this.course = course;
//		System.out.println("setter - course");
//
//	}
//	public void setHobby(String hobby) {
//		this.hobby = hobby;
//		System.out.println("setter - hobby");
//
//	}

	public void getDisplayInfo() {
		System.out.println(" Hi, My name is " + name + ", I want to join course on " + course + ". My hobby =" + hobby);
	}

}

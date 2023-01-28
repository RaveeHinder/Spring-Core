package com.learn.spring.autowiringAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	@Autowired
	@Qualifier("humanHeart")
	private Heart heart;

	public Human(Heart heart) {
		super();
		this.heart = heart;
		System.out.println("constructor of human");

	}

	public Human() {
		System.out.println("DEFAULT constructor of human");

	}
// we can use this in field itself
//	@Autowired
//	@Qualifier("humanHeart") //More than one Bean type with not a similar to byName 
	
//	@Qualifier("octopousHeart")
	public void setHeart(Heart heart) {
		System.out.println("setter method of human");
		this.heart = heart;
	}

	public void getHuman() {
		heart.getHeartStatus();
	}

}

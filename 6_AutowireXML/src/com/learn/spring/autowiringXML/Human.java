package com.learn.spring.autowiringXML;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {

	private Heart heart;

	public Human(Heart heart) {
		super();
		this.heart = heart;
	}

	public void setHeart(Heart heart) {
		System.out.println("Autowiring heart object using annotations in setter method level.");
		this.heart = heart;
	}

	public void getHuman() {
		heart.getHeartStatus();
	}

}

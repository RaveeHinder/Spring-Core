package com.learn.spring.autowiringAnnotations;

public class Heart {

	private String name;
	private int noOfHeart;

	public void getHeartStatus() {
		System.out.println("Heart is pumping...");
		System.out.println("My Name is " + this.getName() + " I have " + this.getNoOfHeart());

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfHeart() {
		return noOfHeart;
	}

	public void setNoOfHeart(int noOfHeart) {
		this.noOfHeart = noOfHeart;
	}

}

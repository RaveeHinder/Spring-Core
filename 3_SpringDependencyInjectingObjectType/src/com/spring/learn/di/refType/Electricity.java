package com.spring.learn.di.refType;

public class Electricity {

	private static int voltage=240;

	public String current() {
		return "passing the AC voltage " + this.voltage++ + ". Thanks to Tesla";
	}

//Constructor injections
	public Electricity(int voltage) {
//		super();
		this.voltage = voltage;
	}

}

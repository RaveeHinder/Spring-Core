package com.learn.spring.ioc;

public class Jio implements Sim{

	@Override
	public void calling() {
		System.out.println("Calling from jio");		
	}

	@Override
	public void data() {
		System.out.println("broswing from jio");				
	}
	
	public Jio() {
		System.out.println("Jio constructor called..");
	}

}

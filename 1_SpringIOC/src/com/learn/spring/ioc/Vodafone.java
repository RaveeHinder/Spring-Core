package com.learn.spring.ioc;

public class Vodafone implements Sim{

	@Override
	public void calling() {
		System.out.println("Calling from vodafone");		
	}

	@Override
	public void data() {
		System.out.println("browsing from vodafone");				
	}

	
	public Vodafone() {
		System.out.println("Vodafone constructor called..");
	}
}

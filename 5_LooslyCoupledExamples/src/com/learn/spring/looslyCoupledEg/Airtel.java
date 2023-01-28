package com.learn.spring.looslyCoupledEg;

public class Airtel {

	private static long mobileNumber = (long) (Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L);
	private Service service;

	public void setService(Service service) {
		this.service = service;
	}

	public void getServiceInfo() {
		System.out.println(" Mobile number is " + this.mobileNumber);
		service.service();
	}

}

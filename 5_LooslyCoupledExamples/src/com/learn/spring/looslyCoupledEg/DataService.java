package com.learn.spring.looslyCoupledEg;

public class DataService implements Service {

	@Override
	public void service() {
		System.out.println("Date service is activated.");
	}

}

package com.learn.spring.looslyCoupledEg;

public class CallService implements Service {

	@Override
	public void service() {
		System.out.println("Call service is activated.");
	}

}

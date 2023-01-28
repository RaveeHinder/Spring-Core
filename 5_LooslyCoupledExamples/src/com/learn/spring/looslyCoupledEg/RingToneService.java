package com.learn.spring.looslyCoupledEg;

public class RingToneService implements Service {

	@Override
	public void service() {
		System.out.println("Ringtone service is activated.");
	}

}

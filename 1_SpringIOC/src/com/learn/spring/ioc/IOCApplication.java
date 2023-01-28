package com.learn.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCApplication {
	public static void main(String[] args) {
		
		// Dependency strongly coupled
//		Vodafone vodafone = new Vodafone();
//		vodafone.calling();
//		vodafone.data();

		// Dependency strongly coupled
//		Jio jio = new Jio();
//		jio.calling();
//		jio.data();

		// No Dependency loosly coupled but still not configurable
//		Sim sim = new Vodafone();
//		sim.calling();
//		sim.data();

		// No Dependency loosly coupled but still not configurable
//		sim = new Jio();
//		sim.calling();
//		sim.data();
		
		//Configurable
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("XML based config loaded..");
		
		//  Dependency tightly coupled but configurable
//		Vodafone voda = (Vodafone) applicationContext.getBean("vodafone");
//		voda.calling();
//		voda.data();
		
		
//		Sim sim = (Sim) applicationContext.getBean("sim");
		
		//  No Dependency loosly coupled and configurable - Runtime polymhorphism
		Sim sim = applicationContext.getBean("sim", Sim.class);

		sim.calling();
		sim.data();
		
		
		
	}

}

package com.learn.spring.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
	
	public static void main(String[] args) {
		
		// IOC application context
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		Human s1 = applicationContext.getBean("ravi", Human.class);
		s1.studentInfo();
		
		s1= applicationContext.getBean("jashwin", Human.class);
		s1.studentInfo();
				
		
		
	}

}

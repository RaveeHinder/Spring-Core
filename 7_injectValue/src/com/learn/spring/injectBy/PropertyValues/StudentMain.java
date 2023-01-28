package com.learn.spring.injectBy.PropertyValues;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Student s =  applicationContext.getBean("studentOne", Student.class);
		s.getDisplayInfo();

	}

}

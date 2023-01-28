package com.learn.spring.looslyCoupled;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		Student s = applicationContext.getBean("stu1", Student.class);
		s.studentInfo();
		
		
	}

}

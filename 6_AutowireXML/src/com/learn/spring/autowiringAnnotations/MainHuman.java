package com.learn.spring.autowiringAnnotations; 

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainHuman {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beansAutoWireAnnotations.xml");
		Human h = applicationContext.getBean("human", Human.class);
		h.getHuman();
		
	}

}

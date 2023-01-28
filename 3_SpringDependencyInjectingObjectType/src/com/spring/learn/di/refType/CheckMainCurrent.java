package com.spring.learn.di.refType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CheckMainCurrent {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("XML config loaded..");
		
		Electronics elect = applicationContext.getBean("genset", Electronics.class);
		System.out.println(elect.checkElectricity());
		
		elect = applicationContext.getBean("genset2", Electronics.class);
		System.out.println(elect.checkElectricity());

	}

}

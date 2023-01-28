package com.learn.spring.commonPackages;

import org.springframework.stereotype.Component;

@Component//Creating bean
public class ScienceTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("This is Science Teacher.");
		
	}

}

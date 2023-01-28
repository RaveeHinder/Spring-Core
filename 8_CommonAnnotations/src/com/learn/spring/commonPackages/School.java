package com.learn.spring.commonPackages;

import org.springframework.stereotype.Component;

@Component()
public class School {
	
	public void getSchoolInfo(String name) {
		System.out.println("School info "+name);
	}

}

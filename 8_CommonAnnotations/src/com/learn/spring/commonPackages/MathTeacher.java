package com.learn.spring.commonPackages;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component()
@Primary // This will the
public class MathTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("This is Math Teacher.");

	}

}

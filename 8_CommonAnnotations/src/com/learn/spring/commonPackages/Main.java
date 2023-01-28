package com.learn.spring.commonPackages;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(Config.class);
//		College cms = appContext.getBean("cms", College.class);	
//		cms.getCollegeInfo("CMS");
		
		
		School school = appContext.getBean("school", School.class);
		school.getSchoolInfo("G.H.S.S");
		
		College esec = appContext.getBean("esec", College.class);
		esec.setLocation("Erode");
		esec.getCollegeInfo("ESEC");
		
		
		
	}

}

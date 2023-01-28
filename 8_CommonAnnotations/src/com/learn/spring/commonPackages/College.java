package com.learn.spring.commonPackages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("cms")
public class College {

	private Principal principal;
	
	private String location;
	
	@Autowired
	@Qualifier("scienceTeacher")
	private Teacher teacher;

	public void getCollegeInfo(String name) {
		System.out.println("College info " + name);
		principal.getPrincipalInfo();
		teacher.teach();
		System.out.println("My Colege located at "+location);
	}

	public College(Principal principal) {
		this.principal = principal;
	}

	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	public String getLocation() {
		return location;
	}
	@Required
	@Value("${college.location}")
	public void setLocation(String location) {
		this.location = location;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

//	@Autowired
//	public void setTeacher(Teacher teacher) {
//		this.teacher = teacher;
//	}
//	
	
	

}

package com.learn.bean.lifecycle;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDVD {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		DvdRentalDAO obj = applicationContext.getBean("dvd", DvdRentalDAO.class);
		
//		obj.getDVDConnection();
		obj.getAllRows();
		obj.deleteDVD(200);
		obj.getAllRows();
//		obj.closeDVDConnection();
//	((ClassPathXmlApplicationContext)applicationContext).close(); // close here it self
	((ClassPathXmlApplicationContext)applicationContext).registerShutdownHook(); // close once main method ends

	}

}

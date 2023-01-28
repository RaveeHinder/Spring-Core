package jdbcConnections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainJDBCConnection {
	
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		JdbcConnections con =  applicationContext.getBean("jdbc", JdbcConnections.class);
		
		con.getJDBCInfo();
		con.getConnections();
		
		
		
	}

}

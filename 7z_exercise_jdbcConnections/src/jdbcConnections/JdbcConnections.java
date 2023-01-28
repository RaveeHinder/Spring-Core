package jdbcConnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;

public class JdbcConnections {
	
	@Value("${posgresql.driver}")
	private String driver;
	@Value("${posgresql.url}")
	private String url;
	@Value("${posgresql.username}")
	private String username;
	@Value("${posgresql.password}")
	private String password;

	
	
	public void getJDBCInfo() {
		StringBuilder sb = new StringBuilder();
		sb.append("Driver = "+driver).append("\nURL = "+url).append("\nPASSWORD = "+password);
		System.out.println("JDBC connection  properties are  \n "+sb);
	}
	
	public void getConnections()  {
		ResultSet rs=null;
		PreparedStatement ps = null;
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,username,password);
			System.out.println("Connection successful. "+con.getClass());
			String s = con.nativeSQL("select first_name, last_name  from actor a where actor_id =1 ");
			ps = con.prepareStatement(s);
			rs =  ps.executeQuery();
			while(rs.next()) {
				System.out.println("Actor's First Name is "+rs.getString(1));
				System.out.println("Actor's Last Name is "+rs.getString(2));

			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				ps.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}

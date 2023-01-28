package com.learn.bean.lifecycle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;

public class DvdRentalDAO {

	@Value("${db.postgres.driver}")
	private String driverName;
	@Value("${db.postgres.url}")
	private String url;
	@Value("${db.postgres.userName}")
	private String userName;
	@Value("${db.postgres.password}")
	private String password;

	@Value("${get.all.actors}")
	private String query;

	Connection con;

//	private String driverName ="org.postgresql.Driver";
//	private String url="jdbc:postgresql://localhost:5432/dvdrental";
//	private String userName="postgres";
//	private String password="admin";
//	
//	private String query="select * from actor a ";

	public void getAllRows() throws ClassNotFoundException, SQLException {

		// Create qry with statement
		Statement st = con.createStatement();

		// Execute query
		ResultSet rs = st.executeQuery(query);

		while (rs.next()) {
			System.out.println("actor_id: " + rs.getInt(1));
			System.out.println("actor_first_name: " + rs.getString(2));
			System.out.println("actor_last_name: " + rs.getString(3));
			System.out.println("actor_id_dob: " + rs.getDate(4));

		}

	}

	public void deleteDVD(int id) throws ClassNotFoundException, SQLException {

		// Create qry with statement
		Statement st = con.createStatement();

		// Execute query
		int rs = st.executeUpdate("update actor set first_name='RAVEE', last_name='BHEEMAN' where actor_id = " + id);

		System.out.println(id + " record update " + rs);

	}

//	@PostConstruct
	public void getDVDConnection() throws SQLException, ClassNotFoundException {
		// Load a driver
		Class.forName(driverName);

		// Get connection
		con = DriverManager.getConnection(url, userName, password);
		System.out.println("Establising connection..");

	}

//	@PreDestroy
	public void closeDVDConnection() throws SQLException {
		con.close();
		System.out.println("Closing connection..");
	}

	
	//via xml postconstruct
	public void init() throws ClassNotFoundException, SQLException {
		getDVDConnection();
	}

	//via xml pre destroy
	public void destroy() throws SQLException {
		closeDVDConnection();
	}

}

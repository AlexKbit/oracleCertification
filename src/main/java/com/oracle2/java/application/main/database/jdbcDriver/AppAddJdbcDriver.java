package com.oracle2.java.application.main.database.jdbcDriver;

import java.sql.DriverManager;
import java.sql.SQLException;

public class AppAddJdbcDriver {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("org.sqlite.JDBC");
			Class.forName("com.mysql.jdbc.Driver");
			// OR
			DriverManager.registerDriver(new org.sqlite.JDBC());
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			// This Driver-class for database (SQLLite/MySql) and each of this implements java.sql.Driver (JDBC interface)
			System.out.println("All drivers sucessfuly connected");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found");
			e.printStackTrace();
		}

	}

}

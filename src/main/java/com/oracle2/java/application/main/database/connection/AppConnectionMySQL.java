package com.oracle2.java.application.main.database.connection;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class AppConnectionMySQL {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		// Java version 1.7+ JDBC drivers adding automaticaly
		
		Properties props = new Properties();
		props.put("user", "root");
		props.put("password", "root");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/certification_db", props);
		
		System.out.println("Connection success: "+ !connection.isClosed());
		showMetaData(connection);
		
		connection.close();
	}
	
	private static void showMetaData(Connection connection) throws SQLException {
        if (connection != null) {
            DatabaseMetaData dm = (DatabaseMetaData) connection.getMetaData();
            System.out.println("MetaData of connection");
            System.out.println("Driver name: " + dm.getDriverName());
            System.out.println("Driver version: " + dm.getDriverVersion());
            System.out.println("Product name: " + dm.getDatabaseProductName());
            System.out.println("Product version: " + dm.getDatabaseProductVersion());
        }
	}

}

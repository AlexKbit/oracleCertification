package com.oracle2.java.application.main.database.connection;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AppConnection {

	public static void main(String[] args) throws Exception {
		
		Connection connection = getConnection();
		showMetaData(connection);
		connection.close();
	}
	
	private static Connection getConnection() throws Exception {
		// register the driver 
        String sDriverName = "org.sqlite.JDBC";
        Class.forName(sDriverName);
        
        String sTempDb = "sqlLite.db";
        String sJdbc = "jdbc:sqlite";
        String sDbUrl = sJdbc + ":" + sTempDb;
        System.out.println("Database url = " + sDbUrl);
        
        // create a database connection
        Connection conn = DriverManager.getConnection(sDbUrl);
        System.out.println("Connected to the database");
        return conn;
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

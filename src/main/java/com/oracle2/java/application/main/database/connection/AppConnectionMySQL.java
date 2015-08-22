package com.oracle2.java.application.main.database.connection;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.mytest.dto.User;


public class AppConnectionMySQL {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		// Java version 1.7+ JDBC drivers adding automaticaly
		
		Properties props = new Properties();
		props.put("user", "root");
		props.put("password", "root");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/certification_db", props);
		
		System.out.println("Connection success: "+ !connection.isClosed());
		showMetaData(connection);
		
		getUsers(connection).stream().forEach(System.out::println);
		
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
	
	private static List<User> getUsers(Connection connection) throws SQLException {
		String sql = "SELECT * FROM certification_db.users";
		List<User> users = new ArrayList<>();
		PreparedStatement ps = connection.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
            users.add(User.create(rs.getInt("id"), rs.getString("name"), rs.getString("surname"), rs.getString("password"), rs.getString("email")));
        }
		
		return users;
	}

}

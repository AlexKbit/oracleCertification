package com.oracle2.java.application.main.localization.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Properties;

public class AppProperties {

	public static void main(String[] args) throws IOException {
		createPropertyFile();
		readPropertyFile();
	}
	
	private static void createPropertyFile() {
		
		Properties prop = new Properties();
		OutputStream output = null;

		try {
			output = new FileOutputStream("config.properties");

			// set the properties value
			prop.setProperty("user", "alexkbit");
			prop.setProperty("password", "mypassword");
			prop.setProperty("language", "java");

			// save properties to project root folder
			prop.store(output, null);

		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}
	
	private static void readPropertyFile() {
		Properties prop = new Properties();
		InputStream input = null;

		try {
			input = new FileInputStream("config.properties");
			// load the properties file from class path
			prop.load(input);

			// get a property value and print it out
			System.out.println(prop.getProperty("user"));

			// get all properties
			Enumeration<?> e = prop.propertyNames();
			while (e.hasMoreElements()) {
				String key = (String) e.nextElement();
				String value = prop.getProperty(key);
				System.out.println("Key : " + key + ", Value : " + value);
			}

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

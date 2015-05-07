package com.oracle.java.application.main.inheritence;

public class ApplicationTestClass {

	private String value;
	public String VALUE = value;
	String gr[] = {"1" , "2"};
	
	public static void main(String[] args) {
		ApplicationTestClass app = new ApplicationTestClass();
		System.out.println(app.value);
	}
	
}

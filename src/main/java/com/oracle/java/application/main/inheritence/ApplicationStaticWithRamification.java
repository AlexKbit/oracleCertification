package com.oracle.java.application.main.inheritence;

public class ApplicationStaticWithRamification {

	private static String lion = "lion";
	private static String tiger = "tiger";
	final static String statement = 250 > 338 ? lion : tiger + " is Bigger";
	
	public static void main(String[] args) {
		System.out.println(statement);
	}
	
}

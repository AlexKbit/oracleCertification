package com.oracle2.java.application.main.exceptions.asserts;

public class AppWithAssert {

	/*
	 * Assert rules:
	 * Don't use assertions to validate arguments to a public method
	 * Use assertions to validate arguments to a private method
	 * Don't use assertions to validate command-line arguments
	 * Use assertions, even in public methods, to check for cases that are never supposed to happen
	 * Don't use assert expressions that can cause side effects. For example:
	 */
	public static void main(String[] args) {
		method(-1);
		System.out.println("Work completed");
	}
	
	private static void method(int i) {		
		  assert i > 0 : "Parameter i must be a positive value";		  
	}
}

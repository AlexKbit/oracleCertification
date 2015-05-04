package com.oracle.java.application.main.operations;

public class ApplicationOperations {

	public static void main(String[] args) {
		check();
	}
	
	private static void check() {
		double d = 123.123;
		int i = 123;
		byte b = 123;
		
		i+=b;
		System.out.println(i);
		b+=i;
		System.out.println(b);
		b+=d;
		// but b = b + d; error
		System.out.println(b);
	}
}

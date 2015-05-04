package com.oracle.java.application.main.equals;

public class ApplicationEquals {
	public static void main(String[] args) {
		checkEqualsForType();		
	}
	
	private static void checkEqualsForType() {
		double d = 123.123;
		int i = 123;
		byte b = 123;

		Double D = d;
		Integer I = i;
		Byte B = b;
		
		System.out.println(D);
		System.out.println(I);
		System.out.println(B);
		
		System.out.println(D.equals(I));
		System.out.println(B.equals(I));
		System.out.println(I.equals(B));
	}
}

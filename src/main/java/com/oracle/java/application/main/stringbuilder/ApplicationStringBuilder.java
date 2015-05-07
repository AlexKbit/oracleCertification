package com.oracle.java.application.main.stringbuilder;

public class ApplicationStringBuilder {

	public static void main(String[] args) {
		checkHash();
		checkEquals();
		checkDelete();
		initSB();
	}
	
	private static void checkHash() {
		StringBuilder builder = new StringBuilder("StringBuffer");
		System.out.println(builder.length());
		System.out.println(builder.hashCode());
	}
	
	private static void checkEquals() {
		StringBuilder b1 = new StringBuilder("StringBuffer");
		StringBuilder b2 = new StringBuilder("StringBuffer");
		System.out.println(b1.equals(b2));
		System.out.println(b1 == b2);
	}
	
	private static void checkDelete() {
		// This is rely interest code :)
		StringBuilder b1 = new StringBuilder("StringBuffer");
		System.out.println(b1.length());
		
		for (int i = 0; i<b1.length(); i++) {
			b1.deleteCharAt(i);
			System.out.println(b1 + " " + b1.length());
		}
		// result: "tigufr 6";
	}
	
	private static void initSB() {
		new StringBuilder();
		new StringBuilder(5);
		// CE: new StringBuilder(6.0);
		new StringBuilder("b");
		// CE : new StringBuilder(false);	
	}
}

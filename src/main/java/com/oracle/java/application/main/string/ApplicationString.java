package com.oracle.java.application.main.string;

public class ApplicationString {

	public static void main(String[] args) {
		compareString();
		strings();
	}
	
	private static void compareString() {
		String stTest1 = "test";
		String stTest2 = "test";
		System.out.println("'test' with 'test':");
		System.out.println(stTest1 == stTest2);
		System.out.println(stTest1.equals(stTest2));
	}
	
	private static void strings() {
		String sm = "my";
		String ss = "string";
		sm = sm.concat(ss);
		System.out.println(sm);
		ss = sm.intern();
		System.out.println(ss == sm);
	}
}

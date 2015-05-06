package com.oracle.java.application.main.string;

public class ApplicationString {

	public static void main(String[] args) {
		compareString();
		strings();
		compareStrings();
		copareWithBuilder();
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
	
	private static void compareStrings() {
		String s1 = "abcd";
		String s2 = "abce";
		System.out.println(s1.compareTo(s2) /* Gets -1 because s2 < s1 */);
		System.out.println(s2.compareTo(s1) /* Gets 1 because s2 > s1 */);
	}
	
	private static void copareWithBuilder() {
		System.out.println("copareWithBuilder");
		String s = "string";
		StringBuilder b = new StringBuilder(s);

		System.out.println(s.compareTo(b.toString()));
		System.out.println(s == b.toString());
		
		b.append("2");
		boolean r = s.equals(b); // s == b : Compilation error
		System.out.println(r);
		System.out.println(s.compareTo(b.toString()));
	}
}

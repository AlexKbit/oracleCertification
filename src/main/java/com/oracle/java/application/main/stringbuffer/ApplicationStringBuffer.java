package com.oracle.java.application.main.stringbuffer;

public class ApplicationStringBuffer {

	public static void main(String[] args) {
		checkHash();
		checkEquals();
	}
	
	private static void checkHash() {
		StringBuffer buff = new StringBuffer("StringBuffer");
		System.out.println(buff.length());
		System.out.println(buff.hashCode());
	}
	
	private static void checkEquals() {
		StringBuffer buff1 = new StringBuffer("StringBuffer");
		StringBuffer buff2 = new StringBuffer("StringBuffer");
		System.out.println(buff1.equals(buff2));
		System.out.println(buff1 == buff2);
	}
}

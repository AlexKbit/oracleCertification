package com.oracle.java.application.main.stringbuilder;

public class ApplicationStringBuilder {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("StringBuffer");
		System.out.println(builder.length());
		System.out.println(builder.hashCode());
	}
}

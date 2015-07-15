package com.oracle2.java.application.main.expressions;

public class ApplicationRunnable {
	static final String NAME = "Alex";
	static final String SURNAME = "Jonson";
	
	public static void main(String[] arg) {
		MyRunnable r = ApplicationRunnable::work;
		r.run(NAME,SURNAME);
	}
	
	public static void work(String name, String surname) {
		System.out.println("Hello "+name+"."+surname);
	}
}

@FunctionalInterface
interface MyRunnable {
	void run(String name, String surname);
}


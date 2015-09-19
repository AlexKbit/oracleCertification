package com.oracle2.java.application.main.lambdaexpressions;

public class ApplicationRunnable {
	static final String NAME = "Alex";
	static final String SURNAME = "Jonson";
	static int n2 = 100; // must be static for lambda expression
	
	public static void main(String[] arg) {
		
		int n1 = 10;
		
		MyRunnable r = ApplicationRunnable::work;
		r.run(NAME,SURNAME);
		
		Runnable runnable = () -> System.out.println(n1 + " " + n2);
		runnable.run();
	}
	
	public static void work(String name, String surname) {
		System.out.println("Hello "+name+"."+surname);
	}
}

@FunctionalInterface
interface MyRunnable {
	void run(String name, String surname);
}


package com.oracle.java.application.main.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ApplicationLambda {
	
	public static void main(String[] args) {
		printList();
		startThread();
		testLambdaFormat();
	}
	
	private static void startThread() {
		Runnable r = () -> System.out.println("Hello! I'm thread");
		Thread th = new Thread(r);
		th.start();
	}
	
	private static void printList() {
		List<String> strList = new ArrayList<String>();
		strList.add("First line");
		strList.add("Second line");
		strList.forEach(System.out::println);
	}
	
	private static void testLambdaFormat() {
		Integer i = 0;
		check(x -> x.equals(i));
		check((x) -> x.equals(i));
		//check((int x) -> x.equals(i)); CE - because int
		check((Integer x) -> x.equals(i));
		check( x -> { return x.equals(i); });
	}
	
	private static void check(Predicate<Integer> p) {
		//do smth
		System.out.println("Do");
	}
}

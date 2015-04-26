package com.oracle.java.application.main.lambda;

import java.util.ArrayList;
import java.util.List;

public class ApplicationLambda {
	
	public static void main(String[] args) {
		printList();
		startThread();
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
}

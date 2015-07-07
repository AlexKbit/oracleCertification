package com.oracle2.java.application.main.inheritence.interfaces;

public interface IMyInterface {
	
	static void doWork() {
		System.out.println("What? Work, work!!!");
	}
	
	public static void main(String[] args) {
		System.out.println("This is interface!");
		doWork();
	}

}

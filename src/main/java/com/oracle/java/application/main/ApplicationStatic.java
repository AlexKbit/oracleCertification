package com.oracle.java.application.main;

public class ApplicationStatic {

	static int count;
	static { count = 0; }
	
	ApplicationStatic() {
		count++;
	}
	public static void main(String[] args) {
		count++;
		new ApplicationStatic();
		new ApplicationStatic();
		// Object o3 = new ApplicationStatic();
		// Dose not compile : System.out.println(o3.count);
		System.out.println(count);
	}

}

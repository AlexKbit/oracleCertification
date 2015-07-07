package com.oracle2.java.application.main.inheritence.interfaces;

public class AppNewField {
	
	public static void main(String[] s) {
		new InterClass().show();
		new SuperInterClass().show();
		
		Inter inter = new InterClass();
		System.out.println(inter.value); //10
	}

}

interface Inter {
	int value = 10;
}

class InterClass implements Inter {
	
	int value = 11;
	
	public void show() {
		System.out.println(value); // 11
	}
}

class SuperInterClass extends InterClass {
		
	public void show() {
		System.out.println(value); // 11
	}
}

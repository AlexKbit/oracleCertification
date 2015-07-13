package com.oracle.java.application.main.inheritence;

public class MyColor extends BaseColor {
	
	public MyColor(String color) {
		super(color);
		System.out.print("3");
	}
	
	public MyColor() {
		System.out.print("3");
	}
	
	public static void main(String... args) {
		new MyColor("red");
		System.out.print("-");
		new MyColor();
	}
}

class BaseColor {
	public BaseColor() { System.out.print("0");}
	public BaseColor(int n) { System.out.print("1");}
	public BaseColor(String color) { this(1); System.out.print("2");}
}



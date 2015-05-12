package com.oracle.java.application.main.inheritence;

public class ApplicationClassExAbstract extends Insect {
	
	public ApplicationClassExAbstract(String color) {
		super(color);
		System.out.println("3");
	}
	
	public ApplicationClassExAbstract() {
		System.out.println("3");
	}
	
	public static void main(String... args) {
		new ApplicationClassExAbstract("red");
		System.out.println("=================");
		new ApplicationClassExAbstract();
	}
}

abstract class Insect {
	public Insect() { System.out.println("0");}
	public Insect(int n) { System.out.println("1");}
	public Insect(String color) { this(1); System.out.println("2");}
}



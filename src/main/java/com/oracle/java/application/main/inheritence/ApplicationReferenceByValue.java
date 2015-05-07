package com.oracle.java.application.main.inheritence;

public class ApplicationReferenceByValue {

	public static void main(String[] args) {
		Toy toy = new Toy();
		play(toy);
		System.out.println(toy.getValue());
	}
	
	private static void play(Toy toy) {
		toy = new Toy();
		toy.change();
	}
}

class Toy {
	private boolean value = false;
	
	public boolean getValue() {return value;}
	public void change() {value = true;}
}
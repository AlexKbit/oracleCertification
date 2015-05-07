package com.oracle.java.application.main.inheritence.overwrite;

public class ApplicationWithObject {

	public static void main(String[] args) {
		Object ob = (Object) new Bird();
		Duck duck = (Duck) ob;
		duck.quak(); 
		// ClassCastException Bird cannot be cast to Duck
	}
}

interface WaterFowl {}
class Bird {}
class Duck extends Bird implements WaterFowl {
	public void quak() {System.out.println("quak");}
	
}

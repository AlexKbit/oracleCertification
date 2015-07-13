package com.oracle.java.application.main.inheritence;

public class ApplicationClassWithClassAndInterface extends Clazz implements Inter {

	//public void show() {System.out.println("super clazz");}
	
	public static void main(String[] args) {
		Inter inter = new ApplicationClassWithClassAndInterface();
		inter.show();
	}
}

class Clazz {
	public void show() {System.out.println("clazz");}
}

interface Inter {
	public void show();
}

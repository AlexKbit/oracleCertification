package com.oracle.java.application.main.inheritence.overwrite;

public class ApplicationOverwrite {
	
	public static void main(String[] args) {
		Class1 cl = new Class2();
		cl.hop();
		
		Class1 cl1 = new Class1();
		cl1.hop();
		
		Class2 cl2 = new Class2();
		cl2.hop();
		
	}
}

class Class1 {
	public void hop() { System.out.println("Class1-hop"); }
}

class Class2 extends Class1 {
	public void hop() { System.out.println("Class2-hop"); }		
}

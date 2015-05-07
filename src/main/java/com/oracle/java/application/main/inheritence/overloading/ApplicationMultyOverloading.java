package com.oracle.java.application.main.inheritence.overloading;

public class ApplicationMultyOverloading {

	static void method(Foo f) {System.out.println("1)method Foo"); } // prioritets Foo > Foo...
	static void method(Foo... f) {System.out.println("2)method Foo..."); }
	
	static void method(int f) {System.out.println("3)method int"); }
	static void method(int... f) {System.out.println("4)method int..."); } // prioritets int > Integer > int... > Integer...
	static void method(Integer f) {System.out.println("5)method Integer"); }
	static void method(Integer... f) {System.out.println("6)method Integer..."); }
	
	static void method(String f) {System.out.println("7)method String"); } // prioritets String > Object
	static void method(Object f) {System.out.println("8)method Object"); }
	
	
	public static void main(String[] args) {
		method(new Foo());
		method(1);
		method(new Integer(1));
		method("");
	}
}

class Foo { }

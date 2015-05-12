package com.oracle.java.application.main.switchs;

public class ApplicationSwitch {

	public static void main(String... args) {
		int x = 10;
		switch( x % 4) {
		default: System.out.println("default");
		case 0: System.out.println("default");
		}
		// default default - because default before case
		
		Variant v = Variant.three;
		switch( v) {
		default: System.out.println("defaultVariant");
		case one: System.out.println("one");
		case two: System.out.println("two");
		case three: System.out.println("three");
		}
		//this is realy interest, print only: three
	}
	
	enum Variant {
		one,two,three
	}
}

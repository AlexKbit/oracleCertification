package com.oracle.java.application.main.switchs;

public class ApplicationSwitch {

	public static void main(String... args) {
		int x = 10;
		switch( x % 4) {
		default: System.out.println("default");
		case 0: System.out.println("default");
		}
		// default default - because default before case
	}
}

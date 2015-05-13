package com.oracle.java.application.main.switchs;

import java.util.Arrays;

public class ApplicationSwitchString {

	public static void main(String[] args) {
		String[] s = {"abc", "a" , "c", "b"};
		Arrays.stream(s).forEach(ss->showSwitch(ss));
	}
	
	private static void showSwitch(String s) {
		switch(s) {
		case "a" : System.out.println("a"); return;
		case "b" : System.out.println("b"); return;
		case "c" : System.out.println("c"); return;
		default : System.out.println("other string"); return;
		}
	}

}

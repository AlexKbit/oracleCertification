package com.oracle.java.application.main.cycles;

public class ApplicationCheckIf {
	
	public static void main(String[] args) {
		int x = 4; 
		if (x <= 5 ^ x == 4)
			System.out.println("Low");
		else if (x == 4)
			System.out.println("Match");
		if (x>1) System.out.println("Height");
	}
}

package com.oracle.java.application.main.cycles;

public class ApplicationCyclesFor {

	public static void main(String[] args) {
		Cycle1();
	}
	
	private static void Cycle1() {
		int j = 1;
		for (int i=0; i<4 && j<3; ++i) {
			++j;
			System.out.print(i+j);
		}
	}

}

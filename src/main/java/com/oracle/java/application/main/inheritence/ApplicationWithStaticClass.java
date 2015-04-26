package com.oracle.java.application.main.inheritence;

public class ApplicationWithStaticClass {

	public static int nStatic = 1;
	public static final int nFinal = 1;
	
	static class TestStatic {
		public int Z = 1;
		public int getValue() {
			nStatic = nStatic + 1;
			return nStatic;
		}
		
		public int getFinal() {
			return nFinal+1;
		}
	}
	
	public static void main(String[] args) {
		TestStatic obj = new TestStatic();
		System.out.println(obj.getValue());
		System.out.println(obj.getValue());
		
		System.out.println(obj.getFinal());
		System.out.println(obj.getFinal());
		

		System.out.println(obj.Z);
	}
}

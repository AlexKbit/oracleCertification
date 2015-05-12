package com.oracle.java.application.main.arrays;

public class ApplicationInitArrays {
	
	public static void main(String[] args) { 
		testInit();		
		printBasicTypes();
		massZerElements();
	}
	
	private static void testInit() {
		int[] m10 = new int[10];
		int m10_2[] = m10;
		int[][] m3x3 = new int[3][3];
		int[] m4x0[] = new int[4][];
		
		System.out.println(m10 == m10_2);
		System.out.println("m10.length = "+m10.length);
		System.out.println("m3x3.length = "+m3x3.length);
		System.out.println("m3x3[0].length = "+m3x3[0].length);
		System.out.println("m4x0.length = "+m4x0.length);
		
		int [] dm1 = new int[] {3,4,5};
		System.out.println("dm1.length = "+dm1.length);
		int [] dm2 = {3,4,5,};
		System.out.println("dm1.length = "+dm2.length);
		
		System.out.println(" ");
	}
	
	private static void printBasicTypes() {
		System.out.println("printBasicTypes ");
		System.out.println("int : "+new int[0]);
		System.out.println("double : "+new double[0]);
		System.out.println("long : "+new long[0]);
		System.out.println("byte : "+new byte[0]);
		System.out.println("char : "+new char[0]);
		System.out.println("String : "+new String[0]);
		System.out.println("boolean : "+new boolean[0]);
		System.out.println("float : "+new float[0]);
		System.out.println(" ");
	}
	
	private static void massZerElements() {
		System.out.println("massZerElements ");
		double[] dm = new double[0];
		System.out.println("Is it null? "+ dm== null);
		System.out.println("dm.length = "+ dm.length);
		//double x = dm[0]; Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
		System.out.println(" ");
	}
	
}

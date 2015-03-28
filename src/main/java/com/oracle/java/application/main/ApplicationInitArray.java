package com.oracle.java.application.main;

import java.util.Arrays;

public class ApplicationInitArray {
	
	public static void main(String... str) {
		int[][] array = {{1, 2, 3}, {0, 0, 0,}, }; // <= LOOK!      
		System.out.println(Arrays.deepToString(array)); 
		
		int[][] array2 = {{1, 2, 3}, {0, 0, 0,}, null}; // <= LOOK!      
		System.out.println(Arrays.deepToString(array2)); 
		
		int array3[][] = {{1, 2}, {3, 4}};
		System.out.println(Arrays.deepToString(array3)); 
		
		int[] array4[] = {{1, 2}, {3, 4}};
		System.out.println(Arrays.deepToString(array4)); 
	}
}

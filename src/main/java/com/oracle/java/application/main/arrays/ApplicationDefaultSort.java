package com.oracle.java.application.main.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ApplicationDefaultSort {
	
	public static void main(String[] args) {
		List numL = Arrays.asList(5, 10, -5 , -10);
		Collections.sort(numL);
		int v1 = Collections.binarySearch(numL, 5);
		int v2 = Collections.binarySearch(numL, 4);
		System.out.println(v1 + v2);
	}

}

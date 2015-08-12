package com.oracle2.java.application.main.lambdaexpressions;

import java.util.function.Predicate;

public class ApplicationWithPredicat {

	public static void main(String [] args) {
		int[] elements = new int[]{-5,-4,-3,-2,-1,0,1,2,3,4,5};
		
		for (int el : elements) {
			work(e -> e > 2, el);
		}
	}
	
	public static void work(Predicate<Integer> p, int e) {
		if (p.test(e)) {
			System.out.println(e);
		}
	}
	

}

package com.oracle2.java.application.main.lambdaexpressions;

import java.util.Arrays;
import java.util.List;

public class ApplicationOldCodeAndNew {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

		System.out.println("Example old:");
		for (int number : numbers) {
			System.out.println(number);
		}		
		
		System.out.println("Example1:");
		numbers.forEach((Integer value) -> System.out.println(value));
		System.out.println("Example2:");
		numbers.forEach(value -> System.out.println(value));
		System.out.println("Example3:");
		numbers.forEach(System.out::println);
	}
}

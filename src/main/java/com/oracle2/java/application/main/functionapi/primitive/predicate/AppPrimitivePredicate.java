package com.oracle2.java.application.main.functionapi.primitive.predicate;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class AppPrimitivePredicate {
	
	public static void main(String[] args) {
		IntPredicate intPredicate = i -> i > 0;
		LongPredicate longPredicate = l -> l > 0;
		DoublePredicate doublePredicate = d -> d > 0;
		
		System.out.println(intPredicate.test(1));
		System.out.println(longPredicate.test(1L));
		System.out.println(doublePredicate.test(1.0));
	}
}

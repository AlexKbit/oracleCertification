package com.oracle.java.application.main.lambda;

import java.util.function.Predicate;

public class ApplicationPredicate {
	int age;
	
	public static void main(String[] args) {
		ApplicationPredicate ap = new ApplicationPredicate();
		ap.age = 1;
		check(ap, a -> {return a.age < 5;}); // or: a -> a.age < 5
	}
	
	private static void check(ApplicationPredicate ap, Predicate<ApplicationPredicate> pred) {
		String result = pred.test(ap) ? "match" : "not match";
		System.out.println(result);
	}
}

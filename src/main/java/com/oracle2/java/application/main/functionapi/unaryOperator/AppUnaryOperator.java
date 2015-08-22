package com.oracle2.java.application.main.functionapi.unaryOperator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class AppUnaryOperator {

	public static void main(String[] args) {
		UnaryOperator<Integer> unary = v -> v * 10;
		// This means the same as the UnaryOperator above.
		Function<Integer, Integer> function = v -> v * 10;

		System.out.println(unary.apply(10));
		System.out.println(function.apply(10));
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.replaceAll(unary);
		//list.replaceAll(function); <== Error!!!
		
		System.out.println(list);
	}

}

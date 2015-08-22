package com.oracle2.java.application.main.functionapi.primitive.unaryOperator;

import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class AppUnaryOperator {

	/*
	 * IntUnaryOperator. Function operation on a single int-valued operand that produces an int-valued result.
	 * LongUnaryOperator. Function operation on a single long-valued operand that produces a long-valued result.
	 * DoubleUnaryOperator. Function operation on a single double-valued operand that produces a double-valued result.
	 */
	public static void main(String[] args) {
		IntUnaryOperator intUnaryOperator = i -> i + i;
		LongUnaryOperator longUnaryOperator = l -> l * l;
		DoubleUnaryOperator doubleUnaryOperator = d -> d / 10;
		
		System.out.println(intUnaryOperator.applyAsInt(100));
		System.out.println(longUnaryOperator.applyAsLong(100));
		System.out.println(doubleUnaryOperator.applyAsDouble(1));
	}
}

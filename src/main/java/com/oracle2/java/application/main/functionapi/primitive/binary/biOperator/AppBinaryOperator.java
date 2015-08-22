package com.oracle2.java.application.main.functionapi.primitive.binary.biOperator;

import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class AppBinaryOperator {

	/*
	 * IntBinaryOperator. Function operation upon two int-valued operands and producing an int-valued result.
	 * LongBinaryOperator. Function operation upon two long-valued operands and producing a long-valued result.
	 * DoubleBinaryOperator. Function operation upon two double-valued operands and producing a double-valued result.
	 */
	public static void main(String[] args) {
		IntBinaryOperator intOperator = (x,y) -> x*y;
		LongBinaryOperator longOperator = (x,y) -> x^y;
		DoubleBinaryOperator doubleOperator = (x,y) -> Math.log(y)*x;
		
		System.out.println(intOperator.applyAsInt(2, 20));
		System.out.println(longOperator.applyAsLong(128, 6));
		System.out.println(doubleOperator.applyAsDouble(10, 2));
	}

}

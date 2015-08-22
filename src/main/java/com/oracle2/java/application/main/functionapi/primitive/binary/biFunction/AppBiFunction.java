package com.oracle2.java.application.main.functionapi.primitive.binary.biFunction;

import java.util.function.BiFunction;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToLongBiFunction;

public class AppBiFunction {
	/*
	 * BiFunction<T, U, R>
	 * ToIntBiFunction<T, U>. Function that accepts two arguments and produces an int-valued result.
	 * ToLongBiFunction<T, U>. Function that accepts two arguments and produces a long-valued result.
	 * ToDoubleBiFunction<T, U>. Function that accepts two arguments and produces a double-valued result.
	 */
	public static void main(String[] args) {
		
		BiFunction<Double, Integer, String> biFunction = (d,i) -> String.valueOf(d+i);
		ToIntBiFunction<Byte, Byte> intF = (b1,b2) -> b1+b2;
		ToLongBiFunction<Byte, Byte> longF = (b1,b2) -> b1+b2;
		ToDoubleBiFunction<Integer, Integer> doubleF = (i1,i2) -> i1 / i2;
		
		System.out.println(biFunction.apply(10.0, 1));
		byte b=10;
		System.out.println(intF.applyAsInt(b, b));
		System.out.println(longF.applyAsLong(b, b));
		System.out.println(doubleF.applyAsDouble(200, 2));
	}
}

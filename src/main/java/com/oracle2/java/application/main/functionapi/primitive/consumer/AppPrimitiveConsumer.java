package com.oracle2.java.application.main.functionapi.primitive.consumer;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class AppPrimitiveConsumer {

	/*
	 * IntConsumer. Operation that accepts a single int-valued argument and returns no result.
	 * LongConsumer. Operation that accepts a single long-valued argument and returns no result.
	 * DoubleConsumer. Operation that accepts a single double-valued argument and returns no result.
	 */
	public static void main(String[] args) {
		IntConsumer intConsumer = System.out::println;
		LongConsumer longConsumer = System.out::println;
		DoubleConsumer doubleConsumer = System.out::println;
		
		intConsumer.accept(0);
		longConsumer.accept(0);
		doubleConsumer.accept(0);
		
	}
}

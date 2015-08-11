package com.oracle2.java.application.main.functionapi.primitive.function;

import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.LongFunction;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;

public class AppPrimitiveFunction {

	public static void main(String[] args) {
		
		IntFunction<String> intFunction = i -> String.valueOf(i); // function (int): String
		intFunction = String::valueOf; // This function (int): String too
		
		LongFunction<String> longFunction = l -> String.valueOf(l); // function (long): String
		longFunction = String::valueOf; // This function (long): String too
		
		DoubleFunction<String> doubleFunction = d -> String.valueOf(d); // function (double): String
		doubleFunction = String::valueOf; // This function (double): String too
		
		System.out.println(intFunction.apply(1));
		System.out.println(longFunction.apply(1L));
		System.out.println(doubleFunction.apply(1.0));
		
		IntToDoubleFunction intToDoubleFunction = (i) -> 1/i;
		IntToLongFunction intToLongFunction = (i) -> i+1L;
		
		LongToDoubleFunction longToDoubleFunction = (l) -> 1/l;
		LongToIntFunction longToIntFunction = (l) -> (int)l;
		
		// DoubleTo**Function is not exist
		//intToDoubleFunction.apply(10)+intToLongFunction.apply(1)+longToDoubleFunction.apply(1.0)+longToIntFunction.apply(1.0);
		
		// ToIntFunction<T>. Function that produces an int-valued result.
		// ToDoubleFunction<T>. Function that produces a double-valued result.
		// ToLongFunction<T>. Function that produces a long-valued result.
	}
}

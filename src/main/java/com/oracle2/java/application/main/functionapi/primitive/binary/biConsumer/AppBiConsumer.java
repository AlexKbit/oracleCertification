package com.oracle2.java.application.main.functionapi.primitive.binary.biConsumer;

import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;

public class AppBiConsumer {

	/*
	 * ObjIntConsumer<T>. Operation that accepts an Object-valued and an int-valued argument and returns no result.
	 * ObjLongConsumer<T>. Operation that accepts an Object-valued and a long-valued argument and returns no result.
	 * ObjDoubleConsumer<T>. Operation that accepts an Object-valued and a double-valued argument and returns no result.
	 */
	public static void main(String[] args) {
		ObjIntConsumer<String> intConsumer = (s, i) -> System.out.println(s + String.valueOf(i));
		ObjLongConsumer<String> longConsumer = (s, l) -> System.out.println(s + String.valueOf(l));
		ObjDoubleConsumer<String> doubleConsumer = (s, d) -> System.out.println(s + String.valueOf(d));
		
		intConsumer.accept("Int-", 1);
		intConsumer.accept("Long-", 1);
		intConsumer.accept("Double-", 1);
	}
}

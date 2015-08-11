package com.oracle2.java.application.main.functionapi.primitive.supplier;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class AppPrimitiveSupplier {

	/*
	 * BooleanSupplier. Supplier of boolean-valued results.
	 * IntSupplier. Supplier of int-valued results.
	 * LongSupplier. Supplier of long-valued results.
	 * DoubleSupplier. Supplier of double-valued results.
	 */
	public static void main(String[] args) {
		BooleanSupplier booleanSupplier = () -> Boolean.TRUE;
		IntSupplier intSupplier = () -> new Integer(0);
		LongSupplier longSupplier = () -> new Long(0);
		DoubleSupplier doubleSupplier = () -> new Double(0);
		
		System.out.println(booleanSupplier.getAsBoolean());
		System.out.println(intSupplier.getAsInt());
		System.out.println(longSupplier.getAsLong());
		System.out.println(doubleSupplier.getAsDouble());
	}
}

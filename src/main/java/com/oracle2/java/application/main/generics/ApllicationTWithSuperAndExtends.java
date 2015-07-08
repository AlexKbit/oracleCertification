package com.oracle2.java.application.main.generics;

import java.util.ArrayList;
import java.util.List;

public class ApllicationTWithSuperAndExtends {

	public static void main(String s) {
		List<? extends Number> foo1 = new ArrayList<Number>();  // Number "extends" Number (in this context)
		List<? extends Number> foo2 = new ArrayList<Integer>(); // Integer extends Number
		List<? extends Number> foo3 = new ArrayList<Double>();  // Double extends Number	
		
		List<? super Integer> foo4 = new ArrayList<Integer>();  // Integer is a "superclass" of Integer (in this context)
		List<? super Integer> foo5 = new ArrayList<Number>();   // Number is a superclass of Integer
		List<? super Integer> foo6 = new ArrayList<Object>();   // Object is a superclass of Integer
	}
}

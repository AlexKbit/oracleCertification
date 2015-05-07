package com.oracle.java.application.main.arrays;

import java.util.ArrayList;
import java.util.List;

public class ApplicationObjectArray {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("string");
		list.add(0, false);
		list.add(1);
		list.remove(1);
		
		boolean b1 = list.contains("string");
		boolean b2 = list.contains(new Boolean(false));
		boolean b3 = list.contains(1);
		
		System.out.println(b1 + " " + b2 + " " + b3);
	}
}

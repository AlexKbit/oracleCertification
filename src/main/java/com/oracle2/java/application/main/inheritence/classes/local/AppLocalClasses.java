package com.oracle2.java.application.main.inheritence.classes.local;

import java.util.ArrayList;
import java.util.List;

public class AppLocalClasses {

	private static boolean defaultvisible = false;
	
	public static void main(String[] args) {
		int[] m = {1,101,1000};
		boolean[] is = {true,false,true};
		validate(m, is, 3).forEach(System.out::println);
	}
	
	public static List<Object> validate(int[] in1, boolean[] in2, int count) {
		
		class ValueWithVisible {
			public int value = count; // look at this
			public boolean isVisible = defaultvisible;  // look at this
			public ValueWithVisible(int n, boolean is) {
				value = n;
				isVisible = is;
			}
			public String toString()
			{
				return String.valueOf(value)+"["+String.valueOf(isVisible)+"]";
			}
			//public static void work(){} //Compile error
		}
		
		List<Object> list = new ArrayList<>();
		for (int i=0; i<count; i++) {
			list.add(new ValueWithVisible(in1[i], in2[i]));
		}
		return list;
	}

}

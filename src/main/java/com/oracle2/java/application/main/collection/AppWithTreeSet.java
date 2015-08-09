package com.oracle2.java.application.main.collection;

import java.util.Set;
import java.util.TreeSet;

import com.mytest.ICertificationTest;

public class AppWithTreeSet implements ICertificationTest{

	public static void main(String[] args) {
		// TreeSet used for fast search by elements of Tree
		Set<Integer> tSet = new TreeSet<Integer>();
		tSet.add(0);
		tSet.add(1);
		tSet.add(2);
		System.out.println(tSet);
	}

}

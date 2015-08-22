package com.oracle2.java.application.main.collection;

import java.util.ArrayList;
import java.util.List;

import com.mytest.ICertificationTest;

public class ApplicationWithArrayList implements ICertificationTest{
	
	public static void main(String[] args) {
		ApplicationWithArrayList app = new ApplicationWithArrayList();
		app.methodObjectList();
		app.methodArrayLength();
		app.spliterator();
		app.checkSize();
	}
	
	private void methodObjectList() {
		List<?> listObject = new ArrayList<>();
		for (Object obj : listObject) {} // only Objects
		
	}
	
	private void methodArrayLength() {
		List<Integer> list = new ArrayList<>(10);
		sysout(""+list.size()); // Sout: 0
	}
	
	private void spliterator() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.spliterator().trySplit().forEachRemaining(System.out::print);
		// try split list on two pice
		sysout(list);
		list.sort((a,b)->b-a); //desc sort
		sysout(list);
	}
	
	private void checkSize() {
		//Debug this
		ArrayList<String> list = new ArrayList<>(12); // set size for inner array, but size = 0
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		sysout(list.size());  
		list.trimToSize();
		sysout(list.size());
	}
}

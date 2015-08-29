package com.oracle2.java.application.main.collection;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
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
		app.removeinList();
		app.sizeofArray();
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
		list.add(0);
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
		System.out.println("In memory = "+getObjectSize(list));
		list.trimToSize();
		System.out.println("In memory = "+getObjectSize(list));
		sysout(list.size());
	}
	
	private void removeinList() {
		//Debug this
		ArrayList<String> list = new ArrayList<>(100); // set size for inner array, but size = 0
		list.add("0");
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		list.add("7");
		list.add("8");
		list.add("9");
		
		sysout(list.size());
		System.out.println("In memory = "+getObjectSize(list));
		list.trimToSize();
		System.out.println("In memory = "+getObjectSize(list));
		sysout(list.size());
	}
	
	private void sizeofArray() {
		Object[][] m1 = new Object[2][1000];
		Object[][] m2 = new Object[1000][2];

		System.out.println("In memory = "+getObjectSize(m1));
		System.out.println("In memory = "+getObjectSize(m2));
	}
	
	
	// Get byte of object in memory  
	public static int getObjectSize(Serializable object) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(baos);
			oos.writeObject(object);
			oos.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return baos.size();
	}
}

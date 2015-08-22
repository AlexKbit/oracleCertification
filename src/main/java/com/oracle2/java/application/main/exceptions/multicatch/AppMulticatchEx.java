package com.oracle2.java.application.main.exceptions.multicatch;

import java.util.Random;

public class AppMulticatchEx {
	
	public static void main(String[] args) {
		testWtihOrForExceptions();

		System.out.println("Generate:");
		for (int i=0; i<10; i++) {
			getMeExceptionPlease();
		}
	}
	
	private static void testWtihOrForExceptions() {
		try {
			int arr[] = new int[5];
			arr[10] = 20;
			int r = arr[10] / 10;
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException ex) {
			//catch(ArrayIndexOutOfBoundsException | Exception ex) { // compile-time error
			System.out.println("Throws exceptions");
		}
	}
	
	private static void getMeExceptionPlease(){
		try {
			Random rd = new Random();
			int x = rd.nextInt(4);
			
			if (x==0) throw new Exception1();
			if (x==1) throw new Exception2();
			if (x==2) throw new Exception3();
			
			throw new Exception();
			
		} catch (Exception1 e) {
			System.out.println("throws Exception1");
		} catch (Exception2 e) {
			System.out.println("throws Exception2");
		} catch (Exception3 e) {
			System.out.println("throws Exception3");
		} catch (Exception e) {
			System.out.println("throws Exception");
		}
	}
}

class Exception1 extends Exception{}
class Exception2 extends Exception{}
class Exception3 extends Exception{}

package com.oracle2.java.application.main.exceptions;

public class AppFinalyAfterReturn {

	public static void main(String[] args) {
		System.out.println(result()); // 1
	}
	
	private static int result() {
		try {
			throw new MyException();
		} catch (MyException mex) {
			return -1;
		} finally {
			return 1;
		}
	}
}

class MyException extends Exception {}

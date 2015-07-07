package com.oracle2.java.application.main.exceptions;

import com.oracle2.java.application.main.exceptions.testexception.MyException;
import com.oracle2.java.application.main.exceptions.testexception.MySecondException;


public class ApplicationLogicInCatch {

	public static void main(String[] args) {
		try {
			throwMyEx();
			throwMySecEx();
		} catch (MyException | MySecondException e) { // This work only for '|'
			System.out.println("So bad");
		}
	}
	
	public static void throwMyEx() throws MyException {
		throw new MyException("Ooops1");
	}
	
	public static void throwMySecEx() throws MySecondException {
		throw new MySecondException("Ooops2");
	}
}

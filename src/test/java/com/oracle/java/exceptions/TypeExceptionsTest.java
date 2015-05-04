package com.oracle.java.exceptions;

import org.junit.Test;

public class TypeExceptionsTest {

	@Test(expected = NumberFormatException.class)
	public void textNullInInteger() {
		new Integer(null);
	}
	
	@Test(expected = NullPointerException.class)	
	public void textNullInDouble() {
		new Double(null);
	}
}

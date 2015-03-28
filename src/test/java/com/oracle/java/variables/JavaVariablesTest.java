package com.oracle.java.variables;

import org.junit.Test;

/**
 * Test for variable for types
 */
public class JavaVariablesTest {

	@Test(expected = NumberFormatException.class)
	public void testCreateIntegerInDoubleFormat() {
		new Integer("32.3");		
	}
	
	@Test(expected = NumberFormatException.class)
	public void testCreateIntegerFromStringFormat() {
		new Integer("hello");		
	}
	
	@Test(expected = NumberFormatException.class)
	public void testCreateIntegerIncorrectParse() {
		Integer.parseInt("232.23");
	}
}

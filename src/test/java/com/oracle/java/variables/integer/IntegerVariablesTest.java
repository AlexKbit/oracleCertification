package com.oracle.java.variables.integer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test for dafault value in types
 */
public class IntegerVariablesTest {

	@Test(expected = NumberFormatException.class)
	public void testCreateDoubleFormat() {
		new Integer("32.3");		
	}
	
	@Test(expected = NumberFormatException.class)
	public void testCreateStringFormat() {
		new Integer("hello");		
	}
	
	@Test(expected = NumberFormatException.class)
	public void testIncorrectParse() {
		Integer.parseInt("232.23");
	}
}

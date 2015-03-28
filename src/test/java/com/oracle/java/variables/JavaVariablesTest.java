package com.oracle.java.variables;

import org.junit.Assert;
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
	
	/**
	 * Double parse can't work with ','
	 */
	@Test(expected = NumberFormatException.class)
	public void testCreateDoubleIncorrectParse() {
		Double.parseDouble("232,123");
	}
	
	@Test
	public void testCompareIntegerAndInt() {
		Integer x1 = new Integer(10);
		int x2 = 10;
		Integer rez = x1.compareTo(x2);
		Assert.assertTrue(rez == 0); // equal
	}
	
	@Test
	public void testCompareIntegerAndDouble() {
		Integer x1 = new Integer(10);
		double x2 = new Double(10.2); // (int) 10.2 => 10
		
		Integer rez = x1.compareTo((int)x2);
		Assert.assertTrue(rez == 0); // equal
	}
	
}

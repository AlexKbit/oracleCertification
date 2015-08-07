package com.mytest;

/**
 * Special interface for simple programming process
 * @author aSavchen
 */
public interface ICertificationTest {

	public default void sysout(Object... objcts) {
		System.out.println(objcts);
	}
	
	public default void sysout(String message) {
		System.out.println(message);
	}
}

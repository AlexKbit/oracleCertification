package com.mytest;

public interface ICertificationTest {

	public default void sysout(Object... objcts) {
		System.out.println(objcts);
	}
	
	public default void sysout(String message) {
		System.out.println(message);
	}
}

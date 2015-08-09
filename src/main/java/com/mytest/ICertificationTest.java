package com.mytest;


/**
 * Special interface for simple programming process
 * @author aSavchen
 */
public interface ICertificationTest {

	public default void sysout(Object... objects) {
		for (Object o : objects)
		System.out.println(o.toString()+" ");
	}
	
	public default void sysout(String message) {
		System.out.println(message);
	}
}

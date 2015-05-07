package com.oracle.java.application.main.inheritence.interfaces;

// interface can be abstract
public abstract interface ITestInterfaceRule {
	
	static final int n = 1; // Compile Error when private or protected
	
	// static method with body
	static void method1() {
		/* code */
	}
	
	// simple method without body
	void method2(); // Compile Error when private or protected
	
	// interface can have abstract method without body
	abstract void method3();
	
	// interface can have default method with body
	default void method4() { }
	
}

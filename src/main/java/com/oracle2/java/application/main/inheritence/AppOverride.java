package com.oracle2.java.application.main.inheritence;

public class AppOverride {

	public static void main(String[] args) {
		
	}
}

class A {
	protected void method() {}
}

class B extends A {
	public void method() {} // public or protected correct override
}

package com.oracle2.java.application.main.inheritence.abstracted;

public abstract class AbstractFromClass extends Base {

	public abstract void show();
	
}

class Base {
	public void show() {
		System.out.println("Base show");
	}
}

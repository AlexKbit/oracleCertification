package com.oracle2.java.application.main.inheritence.abstracted;

public class AbstractFromClass extends Base {

	@Override
	public void show() {
		System.out.println("AbstractFromClass show");		
	}

	@Override
	public void work() {
		super.work();		
	}
	
	public static void main(String[] args) {
		AbstractFromClass cl = new AbstractFromClass();
		cl.show();
		cl.work();
	}
	
}



abstract class AbstractBase extends Base {
	public abstract void show();
	public abstract void work();
}

class Base {
	public void show() {System.out.println("Base show");}
	
	protected void work() {System.out.println("Base work");}
}

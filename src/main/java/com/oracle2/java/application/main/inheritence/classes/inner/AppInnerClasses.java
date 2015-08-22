package com.oracle2.java.application.main.inheritence.classes.inner;

public class AppInnerClasses {

	private int x = 1;
	
	public static void main(String[] s) {
		AppInnerClasses app = new AppInnerClasses();
		AppInnerClasses.InnerClass cl = app.getInner();
		app.x=10; // 1 = 10
		cl.x=20; // 2 = 20
		cl.print();	
	}
	
	class InnerClass {
		private int x = 2;
		public void print() {
			int x = 3;
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(AppInnerClasses.this.x);			
		}
	}
	
	InnerClass getInner() {
		return new InnerClass();
	}
}

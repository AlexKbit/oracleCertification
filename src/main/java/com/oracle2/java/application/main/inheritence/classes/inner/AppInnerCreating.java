package com.oracle2.java.application.main.inheritence.classes.inner;

public class AppInnerCreating {

	public static void main(String[] args) {
		AppInnerCreating t = new AppInnerCreating();
		AppInnerCreating.Inner i = t.new Inner();
        i.m(5);
	}
	
	public int x = 10;

    class Inner {
        public int x = 1;
        void m(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("Test.this.x = " + AppInnerCreating.this.x);
        }
    }
}

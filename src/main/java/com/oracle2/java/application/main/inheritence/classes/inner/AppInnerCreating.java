package com.oracle2.java.application.main.inheritence.classes.inner;

import com.mytest.ICertificationTest;

public class AppInnerCreating {

	public static void main(String[] args) {
		AppInnerCreating t = new AppInnerCreating();
		AppInnerCreating.Inner i = t.new Inner();
        i.m(5);
	}
	
	public int x = 10;

    class Inner implements ICertificationTest {
        public int x = 1;
        void m(int x) {
        	sysout("x = " + x);
        	sysout("this.x = " + this.x);
        	sysout("Test.this.x = " + AppInnerCreating.this.x);
        }
    }
}

package com.oracle2.java.application.main.inheritence.abstracted;

public class ApplicationWithMethods {

	public static void main(String[] args) {
		B b = new D();
		b.method1();
		b = new C();
		b.method1();
	}
}

class D extends B {
	@Override
	public void method1() {	System.out.println("D.method1"); }
	@Override
	protected void method2() {System.out.println("D.method2"); }
}

class C extends B {
	@Override
	public void method1() {	System.out.println("C.method1"); }
	@Override
	protected void method2() {System.out.println("C.method2"); }
}

abstract class B extends A{
	public abstract void method1();
	protected abstract void method2();
}

class A {
	public void method1() {System.out.println("A.method1");}
	protected void method2() {System.out.println("A.method2");}
}

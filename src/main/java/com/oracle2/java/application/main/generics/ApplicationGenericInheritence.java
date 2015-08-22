package com.oracle2.java.application.main.generics;

public class ApplicationGenericInheritence {
	public void main(String[] args) {
		C<String> c = new C<String>();
		c.setMessage("msg");
		c.setValue(0);
	
	}
	
	
}

class A<T> {
	T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}

class B extends A<Integer> {
	
}

class C<T> extends B {
	T message;

	public T getMessage() {
		return message;
	}

	public void setMessage(T message) {
		this.message = message;
	}
	
}

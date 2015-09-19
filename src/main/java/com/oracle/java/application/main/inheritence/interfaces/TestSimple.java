package com.oracle.java.application.main.inheritence.interfaces;

public class TestSimple implements ISimple1, ISimple2 {

	@Override
	public void work() {
		// Good implementation from ISimple1
		// Interface default work() in ISimple2
	}

}

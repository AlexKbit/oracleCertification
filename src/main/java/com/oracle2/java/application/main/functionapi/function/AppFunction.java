package com.oracle2.java.application.main.functionapi.function;

import java.util.function.Function;

public class AppFunction {

	public static void main(String[] args) {
		Calculator<Integer, Integer> calculator = new Calculator<Integer, Integer>();
		calculator.setFunction(x -> x*x);
		calculator.calculate(2);
		calculator.calculate(3);
		calculator.calculate(4);

		calculator.setFunction(x -> x*x*x);
		calculator.calculate(2);
		calculator.calculate(3);
		calculator.calculate(4);
	}
}

class Calculator<T,R> {
	
	Function<T, R> function;	
	
	public R calculate(T value) {
		R result = function.apply(value);
		System.out.println(result);
		return result;
	}
	
	public Function<T, R> getFunction() {
		return function;
	}

	public void setFunction(Function<T, R> function) {
		this.function = function;
	}
	
}

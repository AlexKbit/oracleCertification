package com.oracle2.java.application.main.exceptions;

public class AppThrowExceptionMethod {

	public static void main(String[] args) {
		try {
			validate("asdfghj");
			validate("asdhj");
		} catch (ValidateException e) {
			System.out.println("Catch block!");
		} finally {
			System.out.println("Finally block!");
		}
		System.out.println("Base block!");
	}
	
	private static void validate(String password) throws ValidateException {
		if (password.length() < 6) {
			System.out.println(String.format("Password [%s] not valid!",password));
			throw new ValidateException();
		}
		System.out.println(String.format("Password [%s] is valid.",password));
	}
}

class ValidateException extends Exception {}

package com.oracle2.java.application.main.optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class AppOptional {

	public static void main(String[] args) {
		emptyOption();
		
		String strNull = null;
		Optional<String> nullableOptional = Optional.ofNullable(strNull);
		//Optional.of(strNull); throws NullPointerException

		System.out.println(nullableOptional.orElse("String is null")); // if value == null than return 'String is null'
		System.out.println(nullableOptional.orElseGet(String::new)); // if value == null than return new String()
		try {
			System.out.println(nullableOptional.orElseThrow(MyExeption::new)); // if value == null than throws MyException
		} catch (MyExeption e) {
			System.out.println("Throw MyExeption");
		} finally {
			System.out.println("Throw in trap:)");
		}
		
		System.out.println(nullableOptional.isPresent()); //There is the possiblity to check value is null or not	
		nullableOptional.ifPresent(System.out::println); // do if value not null
	}
	
	private static void emptyOption() {
		Optional<String> emptyOptional = Optional.empty();
		try {
		System.out.println(emptyOptional.get());
		} catch(NoSuchElementException ex) {
			System.out.println("throws NoSuchElementException");
		} finally {
			System.out.println("Thats good");
		}
	}
}

class MyExeption extends Exception {}

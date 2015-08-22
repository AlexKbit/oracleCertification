package com.oracle2.java.application.main.streamsapi.searchdata;

import java.util.Optional;
import java.util.stream.Stream;

import com.mytest.ICertificationTest;

public class AppStreamSearch implements ICertificationTest {

	public static void main(String[] args) {
		
		Optional<Integer> first = Stream.of(1, 10, 5, 3, 13, 20).filter(i -> i % 2 == 0).findFirst(); //returns 10
		Optional<Integer> any = Stream.of(1, 30, 40, 5, 3, 13, 20).parallel().filter(i -> i % 2 == 0).findAny(); //can return 30 or 20 or 40
		boolean any2 = Stream.of(1, 10, 5, 3, 13, 20).anyMatch(i -> i % 3 == 0); //returns true
		boolean all = Stream.of(1, 10, 5, 3, 13, 20).allMatch(i -> i % 2 == 0); //returns false
		boolean none = Stream.of(1, 10, 5, 3, 13, 20).noneMatch(i -> i % 6 == 0); //returns true
		
		System.out.println(first.get());
		System.out.println(any.get());
		System.out.println(any2);
		System.out.println(all);
		System.out.println(none);
	}
}

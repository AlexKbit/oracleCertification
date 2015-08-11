package com.oracle2.java.application.main.streamsapi;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.mytest.dto.User;
import com.mytest.factories.UserFactory;

public class AppStreamPeek {

	public static void main(String[] args) {
		
		Stream.of("a", "aa", "aaa", "aaaa", "aaaaa")
		   .peek(e -> System.out.println("Base value: " + e))
		   .filter(e -> e.length() > 3)
		   .peek(e -> System.out.println("Filtered value: " + e))
		   .map(String::toUpperCase)
		   .peek(e -> System.out.println("Mapped value: " + e))
		   .collect(Collectors.toList());
		
		/*
		 * Base value: a
		 * Base value: aa
		 * Base value: aaa
		 * Base value: aaaa
		 * Filtered value: aaaa
		 * Mapped value: AAAA
		 * Base value: aaaaa
		 * Filtered value: aaaaa
		 * Mapped value: AAAAA
		 */
		
		mapper(); // return 6
	}
	
	public static void mapper() {
		UserFactory factory = new UserFactory();
		int id = factory.generate(10).stream()
				.mapToInt(User::getId)
				.filter(x -> x > 5)
				.distinct()
				.findFirst()
				.getAsInt();
		System.out.println(id);
	}
}

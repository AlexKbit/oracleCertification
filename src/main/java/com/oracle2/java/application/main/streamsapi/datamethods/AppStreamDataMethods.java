package com.oracle2.java.application.main.streamsapi.datamethods;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class AppStreamDataMethods {

	public static void main(String[] args) {
		Comparator<String> byLength = (s1, s2) -> Integer.compare( s1.length(), s2.length());
		
		Optional<String> max = Stream.of("hello","good bye", "black", "white", "good", "bad")
		        .max(byLength); //returns "good bye"
		
		System.out.println(max.get());
		
		Optional<String> min = Stream.of("hello","good bye", "black", "white", "good", "bad")
		        .min(byLength); //returns "bad"
		
		System.out.println(min.get());

		long count = Stream.of("hello","good bye", "black", "white", "good", "bad")
		        .count(); //returns 6

		System.out.println(count);
	}
}

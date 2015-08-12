package com.oracle2.java.application.main.streamsapi.sort;

import java.util.Comparator;
import java.util.stream.Stream;

public class AppStreamSort {

	public static void main(String[] args) {
		sort1();
		System.out.println("==================");
		sort2();
	}
	
	private static void sort1() {
		Comparator<String> byLength = (s1, s2) -> Integer.compare( s1.length(), s2.length());

		Stream.of("hello","good bye", "black", "white", "good", "bad")
		          .sorted(byLength)
		          .forEach(s -> System.out.println(s));
	}
	
	private static void sort2() {
		Comparator<String> byLength = (s1, s2) -> Integer.compare( s1.length(), s2.length());
		Comparator<String> byLetters = (s1, s2) -> s1.compareTo(s2);

		Stream.of("hello","good bye", "black", "white", "good", "bad")
		          .sorted(byLength.thenComparing(byLetters))
		          .forEach(System.out::println);
	}
}

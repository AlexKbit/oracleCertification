package com.oracle2.java.application.main.streamsapi.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class AppStreamCollect {

	public static void main(String[] args) {
		
		List<String> letters = new ArrayList<>();
		letters.add("H");
		letters.add("e");
		letters.add("l");
		letters.add("l");
		letters.add("o");
		
		collect(letters);
		collectToList(letters);
		collectToTreeSet(letters);
	}
	
	private static void collect(List<String> letters) {
		
		List<String> word = letters.stream().collect(ArrayList::new, (c, s) -> c.add(s.toUpperCase()),
				(c1, c2) -> c1.addAll(c2));

		String message = word.stream().collect(StringBuffer::new, StringBuffer::append, StringBuffer::append)
				.toString();
		System.out.println(message);
	}
	
	private static void collectToList(List<String> letters) {

		List<String> word = letters.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println("List: "+word);
	}
	
	private static void collectToTreeSet(List<String> letters) {

		// Accumulate into a TreeSet
		Set<String> set = letters.stream()
		                          .map(s -> s.toUpperCase())
		                          .collect(Collectors.toCollection(TreeSet::new));
		System.out.println("TreeSet: "+set);
	}
}

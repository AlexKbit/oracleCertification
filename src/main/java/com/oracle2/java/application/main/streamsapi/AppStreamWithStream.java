package com.oracle2.java.application.main.streamsapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AppStreamWithStream {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		Stream<Integer> stream = list.stream().filter(x -> x > 1);
		list = stream.distinct().collect(Collectors.toList());
		System.out.println(list);
		
	}
}

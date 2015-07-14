package com.oracle2.java.application.main.expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ApplicationSelectAgeFromPeople {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person(20));
		people.add(new Person(21));
		people.add(new Person(22));
		people.add(new Person(23));
		
		System.out.println(sumAges(people));		
	}
	
	public static int sumAges(List<Person> list) {
		IntStream ages = list.stream().mapToInt(p -> p.getAge());
		return ages.sum();
	}
}


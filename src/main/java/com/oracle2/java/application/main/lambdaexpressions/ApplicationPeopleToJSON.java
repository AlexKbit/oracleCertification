package com.oracle2.java.application.main.lambdaexpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ApplicationPeopleToJSON {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person(20));
		people.add(new Person(21));
		people.add(new Person(22));
		people.add(new Person(23));
		
		String json = people.stream().map(Person::toString)
				.collect(Collectors.joining(", ", "[", "]"));
		System.out.println(json);
	}
}


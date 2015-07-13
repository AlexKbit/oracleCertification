package com.oracle2.java.application.main.expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ApplicationSelectPeople {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person(20));
		people.add(new Person(21));
		people.add(new Person(22));
		people.add(new Person(23));
		List<Person> result = selectByAge(people, 21);
		
		result.forEach(System.out::println);
	}
	
	public static List<Person> selectByAge(List<Person> list, int age) {
		List<Person> people = list.stream().filter(p -> p.getAge() > age).collect(Collectors.toList());
		return people;
	}
}

class Person {
	private int age;
	
	public Person(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public String toString() {return String.valueOf(age);}
}

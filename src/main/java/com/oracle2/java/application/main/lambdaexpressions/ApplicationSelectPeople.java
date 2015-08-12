package com.oracle2.java.application.main.lambdaexpressions;

import java.util.ArrayList;
import java.util.List;

public class ApplicationSelectPeople {

	public static void main(String[] args) {
		int age = 20;
		
		List<Person> people = new ArrayList<>();
		people.add(new Person(20));
		people.add(new Person(21));
		people.add(new Person(22));
		people.add(new Person(23));
		
		people.stream().filter(p -> p.getAge() > age).forEach(System.out::println);
	}
}

class Person {
	private int age;	
	public Person(int age) {this.age = age;}	
	public int getAge() {return age;}	
	public String toString() {return String.valueOf(age);}
}

package com.oracle2.java.application.main.streamsapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.mytest.dto.User;

public class AppStream {

	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		users.add(User.create(12345,"Jon","Hoppy","Qwerty","jon.hop@google.com"));
		users.add(User.create(64533,"Jena","Teffy","dfjewre","jena.jen@google.com"));
		users.add(User.create(91023,"Terry","Markler","oid834e","terry.test@google.com"));
		users.add(User.create(72345,"Indy","Krovs","password","indy.krovs@google.com"));
		users.add(User.create(72345,"Indy","Krovs","password","indy.krovs@google.com"));
		
		testDistinct(users);
		testLimit(users);
		testSkip(users);
		testSequential(users);
	}
	
	private static void testDistinct(List<User> users) {
		System.out.println("==========Distinct=========");
		List<String> names = users.stream().peek(System.out::println)  // Print 'Indy' two
				  .distinct()
				  .peek(System.out::println)  // Print 'Indy' one
				  .map(u -> u.getName())
				  .collect(Collectors.toList());
		System.out.println(names); // [Jon, Jena, Terry, Indy] { Remove second 'Indy'}
		System.out.println("===========================");
	}
	
	private static void testLimit(List<User> users) {
		System.out.println("============Limit==========");
		List<String> names = users.stream().peek(System.out::println) // Print 'Jon' and 'Jena'
				  .limit(2)
				  .peek(System.out::println) // Print 'Jon' and 'Jena'
				  .map(u -> u.getName())
				  .collect(Collectors.toList());
		System.out.println(names); // [Jon, Jena]
		System.out.println("===========================");
	}
	
	private static void testSkip(List<User> users) {
		System.out.println("============Skip===========");
		List<String> names = users.stream().peek(System.out::println) // Print all names
				  .skip(2)
				  .peek(System.out::println) // Print 'Terry' and 'Indy' and 'Indy'
				  .map(u -> u.getName())
				  .collect(Collectors.toList());
		System.out.println(names); // [Terry, Indy, Indy]
		System.out.println("===========================");
	}
	
	private static void testSequential(List<User> users) {
		System.out.println("===========Sorted==========");
		List<Integer> names = users.stream().peek(System.out::println) // Print [Jon, Jena, Terry, Indy, Indy]
				  .sorted() // User must implemetn java.lang.Comparable
				  .peek(System.out::println) // Print [Jon, Jena, Indy, Indy, Terry]
				  .map(u -> u.getId())
				  .collect(Collectors.toList());
		System.out.println(names); // [12345, 64533, 72345, 72345, 91023]
		System.out.println("===========================");
	}
}

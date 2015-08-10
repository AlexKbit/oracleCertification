package com.oracle2.java.application.main.functionapi.predicate;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.mytest.dto.User;
import com.mytest.factories.UserFactory;

public class AppPredicate {
	
	public static void main(String[] args) {
		UserFactory factory = new UserFactory();
		List<User> users = factory.generate(10);
		
		Processer processer = new Processer();
		users.forEach(processer);
	}
}

class Processer implements Consumer<User> {

	Predicate<User> predicate = u -> u.getPassword().length() > 6 && u.getId() > 4;

	@Override
	public void accept(User user) {
		if (predicate.test(user)) {
			System.out.println(user);
		}			
	}
}

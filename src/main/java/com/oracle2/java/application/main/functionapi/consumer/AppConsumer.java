package com.oracle2.java.application.main.functionapi.consumer;

import java.util.List;
import java.util.function.Consumer;

import com.mytest.dto.User;
import com.mytest.factories.UserFactory;

public class AppConsumer {

	public static void main(String[] args) {
		UserFactory factory = new UserFactory();
		List<User> list = factory.generate(3);
		
		UserManager.hello(list, u -> System.out.println("Hello "+u.getName()+"!"));
		Consumer<User> consumer = u -> {
			u.setPassword("༼つ ◕_◕ ༽つ");
			System.out.println("Look my password: " + u.getPassword());
		};
		consumer = consumer.andThen(u -> u.setPassword("PASSWORD"));
		UserManager.hello(list, consumer);
		list.forEach(System.out::println);
	}
}

class UserManager {
	public static void hello(List<User> users, Consumer<User> consumer) {
		users.forEach(consumer);
	}
}
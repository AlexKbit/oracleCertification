package com.mytest.factories;

import java.util.ArrayList;
import java.util.List;

import com.mytest.dto.User;

public class UserFactory implements IFactory<User> {

	public User create(String name, String surname, String password, String email) {
		return User.create(name, surname, password, email);
	}

	@Override
	public List<User> generate(int count) {
		List<User> list = new ArrayList<>();
		for (int i=0; i<count; i++) {
			User u = new User("Name"+i, "Surname"+i, "", "EmailAdress"+i);
			u.setId(i);
			u.setPassword(String.valueOf(u.hashCode()));
			list.add(u);
		}
		return list;
	}
	
	
}

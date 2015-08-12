package com.mytest.dto;

import java.util.ArrayList;
import java.util.List;

import com.mytest.factories.UserFactory;

public class UserService {

	List<User> users = new ArrayList<>();
	
	public UserService() {
		users = new ArrayList<>();
	}
	
	public UserService(int count) {
		UserFactory factory = new UserFactory();
		users = factory.generate(count);
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	
}

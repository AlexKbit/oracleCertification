package com.mytest;

import java.util.List;

import com.mytest.dto.User;
import com.mytest.factories.UserFactory;

/**
 * Special interface for simple programming process
 * @author aSavchen
 */
public interface ICertificationTest {

	public default void sysout(Object... objects) {
		for (Object o : objects)
		System.out.println(o.toString()+" ");
	}
	
	public default void sysout(String message) {
		System.out.println(message);
	}
	
	public default List<User> generateUsers(int n) {
		UserFactory factory = new UserFactory();
		return factory.generate(n);
	}

	public default User createUser() {
		return generateUsers(1).get(0);
	}
}

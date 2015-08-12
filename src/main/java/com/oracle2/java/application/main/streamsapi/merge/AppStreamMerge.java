package com.oracle2.java.application.main.streamsapi.merge;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.mytest.dto.UserService;

public class AppStreamMerge {

	public static void main(String[] args) {
		List<UserService> services = new ArrayList<>();
		services.add(new UserService(3)); // [Name0, Name1, Nmae2]
		services.add(new UserService(6)); // [Name0, Name1, Nmae2, Name3, Nmae4, Name5]
		services.add(new UserService(9)); // [Name0, Name1, Nmae2, Name3, Nmae4, Name5, Nmae6, Name7, Nmae8]		
		
		List<String> useNames = services.stream()
	            .flatMap(service -> service.getUsers().stream()) //Get the user of each service
	            .filter(u -> u.getId() > 4)
	            .map(user -> user.getName()) //Now that we have a stream with all the user, we extract their name
	            .collect(Collectors.toList());
		System.out.println(useNames);
	}

}

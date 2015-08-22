package com.oracle2.java.application.main.functionapi.supplier;

import java.util.function.Supplier;

import com.mytest.dto.User;

public class AppSupplier {

	public static void main(String[] args) {
		
		for (int i=0; i<5; i++) {
			System.out.println(generate(()->new User("name", "surname", null, null)));
		}
		
	}
	
    static User generate(Supplier<User> supplier) {
        return supplier.get();
    }
    
}

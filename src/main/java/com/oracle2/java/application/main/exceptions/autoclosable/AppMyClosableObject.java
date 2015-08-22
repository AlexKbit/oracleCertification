package com.oracle2.java.application.main.exceptions.autoclosable;

public class AppMyClosableObject {

	public static void main(String[] args) throws Exception {
		// Only one try, because in main: throws Exception^
		try (MyAutoClosable obj = new MyAutoClosable()) {
			obj.someMethod();
		}
		
	}
}

class MyAutoClosable implements AutoCloseable {
    public void someMethod() {
       System.out.println("Doing something");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closed!");
    }
}

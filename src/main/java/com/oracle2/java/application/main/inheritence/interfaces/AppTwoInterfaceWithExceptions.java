package com.oracle2.java.application.main.inheritence.interfaces;

import java.io.IOException;
import java.sql.SQLException;

public class AppTwoInterfaceWithExceptions implements I11,I12 {

	public static void main(String[] ar) {
		AppTwoInterfaceWithExceptions app = new AppTwoInterfaceWithExceptions();
		app.work();
		
		I11 i11 = app;		
		try {
			i11.work();
		} catch (IOException e) {
			
		}
	}

	public void work() {
		System.out.println("Hello");
	}
}

interface I11 {
	void work() throws IOException;
}

interface I12 {
	void work() throws SQLException;
}

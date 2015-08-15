package com.oracle2.java.application.main.io.fundamentals.api;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.mytest.files.FileService;

public class AppPrintWriter {

	public static void main(String[] args) throws IOException {
		PrintWriter writer = new PrintWriter(new FileWriter(
				FileService.pathOutputFor("output.txt")));
		writer.print(true);
		writer.print(1);
		writer.print(1.23);
		writer.println("new string: ");

		// printf and format methods do the same
		writer.printf("%s", "Hi");
		writer.format("%s", "Hi");

		writer.close();
		System.out.println("See output.txt");
	}

}

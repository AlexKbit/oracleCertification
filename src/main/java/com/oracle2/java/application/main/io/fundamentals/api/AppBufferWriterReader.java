package com.oracle2.java.application.main.io.fundamentals.api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

import com.mytest.files.FileService;

public class AppBufferWriterReader {

	public static void main(String[] args) throws IOException {
		Reader r = new BufferedReader(new FileReader(
				FileService.FILE_WITH_LINES), 1024);
		System.out.println(r.read());
		r.close();
		
		BufferedWriter input = new BufferedWriter(new FileWriter(
				FileService.createNew("file.txt")), 1024);
		input.write("This BufferedWriter");
		input.close();

	}

}

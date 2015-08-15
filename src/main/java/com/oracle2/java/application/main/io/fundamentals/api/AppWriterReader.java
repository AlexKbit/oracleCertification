package com.oracle2.java.application.main.io.fundamentals.api;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

import com.mytest.files.FileService;

public class AppWriterReader {

	public static void main(String[] args) throws IOException {
		read();
		write();

	}
	
	private static void read() throws IOException {
		Reader reader = new FileReader(FileService.FILE_WITH_LINES);
		int data = reader.read();
		while(data != -1){
		    char dataChar = (char) data;
		    System.out.println(dataChar);
		    data = reader.read();
		}
		reader.close();
		System.out.println("end");
	}
	
	private static void write() throws IOException {
		Writer writer = new FileWriter(FileService.createNew("file.txt"));
		writer.write("Hello World Writer");
		writer.close();
		System.out.println("end");
	}

}

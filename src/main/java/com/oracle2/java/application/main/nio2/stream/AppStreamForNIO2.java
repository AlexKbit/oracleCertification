package com.oracle2.java.application.main.nio2.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

import com.mytest.files.FileService;

public class AppStreamForNIO2 {

	public static void main(String[] args) throws IOException {
		
		Path generate = FileService.generateDirWithFiles();
		
		try (Stream<Path> stream = Files.list(generate)) {
		    stream.map(String::valueOf) // Autoclosable
		        .filter(path -> path.endsWith(".txt"))
		        .forEach(System.out::println);
		}
		
	}

}

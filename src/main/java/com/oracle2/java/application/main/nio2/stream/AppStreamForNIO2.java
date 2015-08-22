package com.oracle2.java.application.main.nio2.stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import com.mytest.files.FileService;

public class AppStreamForNIO2 {

	public static void main(String[] args) throws IOException {
		
		Path generate = FileService.generateDirWithFiles();
		
		System.out.println("method Files.list");
		try (Stream<Path> stream = Files.list(generate)) {
		    stream.map(String::valueOf) // Autoclosable
		        .filter(path -> path.endsWith(".txt"))
		        .forEach(System.out::println);
		}

		System.out.println("method Files.find");
		try (Stream<Path> stream = Files.find(generate, 3,
				(path, attr) -> String.valueOf(path).endsWith("0.txt"))) {
			stream.map(String::valueOf).forEach(System.out::println);
		}

		System.out.println("method Files.walk");
		try (Stream<Path> stream = Files.walk(generate, 3)) {
		    stream.map(String::valueOf).
		          filter(path -> path.endsWith(".txt")).
		          forEach(System.out::println);
		}
		
		System.out.println("method Files.lines");
		try (Stream<String> stream = Files.lines(Paths.get(FileService.FILE_WITH_LINES))) {
		    stream.map(String::toLowerCase).forEach(System.out::println);
		}

		System.out.println("method Files.newBufferedReader");
		try (BufferedReader reader = Files.newBufferedReader(Paths.get(FileService.FILE_WITH_LINES))) {
		    reader.lines().map(String::toLowerCase).forEach(System.out::println);
		}
		
	}

}

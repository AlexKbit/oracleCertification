package com.oracle2.java.application.main.io.fundamentals.api;

import java.io.File;
import java.util.Arrays;

import com.mytest.files.FileService;

public class AppFiles {

	public static void main(String[] args) {
		File file = new File(FileService.FILE_WITH_LINES);
		System.out.println("isFile "+file.isFile());
		System.out.println("isDirectory "+file.isDirectory());
		System.out.println("isExist "+file.exists());
		System.out.println("isHidden "+file.isHidden());
		System.out.println("AbsolutePath "+file.getAbsolutePath());

		File directory = new File(FileService.INPUT_FILES);
		System.out.println("Files in "+directory.getAbsolutePath());
		Arrays.asList(directory.listFiles()).stream().map(f -> f.getName()).forEach(System.out::println);

	}

}

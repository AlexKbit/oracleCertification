package com.oracle2.java.application.main.exceptions.autoclosable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.mytest.files.FileService;

public class AppAutoClosableException {

	public static void main(String[] args) {
		
		try (BufferedReader br = new BufferedReader(new FileReader(FileService.FILE_WITH_LINES))) {
	        System.out.println(br.readLine());
	    } catch (IOException e) {
	        System.out.println("Not scheduled error");
		}
		// BufferedReader is closed
	}

}

package com.oracle2.java.application.main.io.fundamentals.api;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.mytest.files.FileService;

public class AppStreamInputOutput {

	public static void main(String[] args) throws IOException {
		input();
		output();

	}
	
	private static void input() throws IOException {
		InputStream fis = new FileInputStream(FileService.FILE_WITH_LINES);
		byte[] data = new byte[1024];
		int bytesRead = fis.read(data);
		while(bytesRead != -1) {
		  bytesRead = fis.read(data);
		}
		System.out.println(bytesRead);
		fis.close();
	}
	
	private static void output() throws IOException {
		//OutputStream fos1 = new FileOutputStream("c:\\text.txt"); //overwrites file
		//OutputStream fos2 = new FileOutputStream("c:\\text.txt", true); //appends to file
		//OutputStream fos3 = new FileOutputStream("c:\\text.txt", false); //overwrites file
		OutputStream output = null;
		try {
		  output = new FileOutputStream(FileService.pathOutputFor("file.txt"),true);

		 for (int i = 0; i< 5; i++) {
		    int data = i;
		    output.write(data);
		    System.out.println(data);
		  }
		} finally {
		    if(output != null) {
		        output.close();
		    }
		}
	}

}

package com.oracle2.java.application.main.io.fundamentals.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppConsoleBufferedReader {

	public static void main(String[] args) {
		try {
			   BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
			   String s = bufferRead.readLine();

			   System.out.println(s);
			}
			catch(IOException ex)
			{
			  ex.printStackTrace();
			}
	}
}

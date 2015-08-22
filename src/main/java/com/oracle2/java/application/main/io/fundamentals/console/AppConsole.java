package com.oracle2.java.application.main.io.fundamentals.console;

import java.io.Console;

public class AppConsole {

	public static void main(String[] args) {
		Console console = null;
		String s = null;
		try
		{
		   console = System.console();
		   if (console != null)
		   {
			  System.out.println("You name:");
		      s = console.readLine();
		      System.out.println("Hello "+s);
		      
		      System.out.println("You password:");
		      char[] pass = console.readPassword();
		      System.out.println("Password "+pass.toString());
		      
			  console.format("[%s]", "Hi");
			  console.printf("[%s]", "Hi again");
			  console.format("Or just hi");
		   }
		} catch (Exception ex)
		{
		   ex.printStackTrace();
		}
	}

}

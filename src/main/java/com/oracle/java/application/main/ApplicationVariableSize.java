package com.oracle.java.application.main;

public class ApplicationVariableSize {

	public static void main(String[] args) {
		print("Long     ", Long.SIZE, "0L");
		print("Double   ", Double.SIZE, "0.0d");
		print("Integer  ", Integer.SIZE, "0");
		print("Float    ", Float.SIZE, "0.0f");
		print("Character", Character.SIZE, "\u0000");
		print("Short    ", Short.SIZE, "0");
		print("Byte     ", Byte.SIZE, "0");
		print("Boolean  ", 8, "false");

	}
	
	private static void print(String name, int size, String defult) {
		System.out.println(String.format(
				"[%s].size = %s (bit); %s (byte) Default Value (for fields) = %s",
				name ,size, size / 8, defult));
	}

}

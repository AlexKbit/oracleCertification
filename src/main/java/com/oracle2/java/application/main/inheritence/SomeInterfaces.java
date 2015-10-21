package com.oracle2.java.application.main.inheritence;

public interface SomeInterfaces {
	public static void main(String[] args) {
		//Office off = new HomeOffice();
		//System.out.println(off.getAddress());  
		//This static method of interface Office can only be accessed as Office.getAddress
	}
}

interface House {
	public default String getAddress() {
		return "";
	}
}

interface Office {
	public static String getAddress() {
		return "101 Smart Str";
	} 
}  

interface WFH extends House, Office{ }  

class HomeOffice implements House, Office {
	public String getAddress(){
		return "R No 1, Home";
	}
}  

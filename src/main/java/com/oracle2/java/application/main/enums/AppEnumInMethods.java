package com.oracle2.java.application.main.enums;

public class AppEnumInMethods {

	public static void main(String[] args) {
		MyEnum myEnum = MyEnum.E1;
		work(myEnum);
		System.out.println(myEnum);
	}
	
	public static void work(MyEnum enum1) {
		enum1 = null;
	}
}

enum MyEnum {
	E1,E2,E3;
}

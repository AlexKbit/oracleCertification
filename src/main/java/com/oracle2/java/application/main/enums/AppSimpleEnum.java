package com.oracle2.java.application.main.enums;

public class AppSimpleEnum {

	public static void main(String[] args) {
		ResultEnum r = ResultEnum.ENUM;
		r.work();
		
		//System.out.println(Enum1.ONE == Enum2.THREE); // Incompatible operand types Enum1 and Enum2
		System.out.println(Enum1.ONE.equals(Enum2.THREE));	
		System.out.println(Enum1.THREE.equals(Enum2.THREE));		
	}
}

enum Enum1 {
	ONE,TWO,THREE
}

enum Enum2 {
	THREE,FOUR,FIVE
}

enum ResultEnum implements I1 {
	ENUM;
	
	@Override
	public void work() {
		System.out.println("Hello, I'm enum with I1");		
	}
}

interface I1 {
	public void work();
}

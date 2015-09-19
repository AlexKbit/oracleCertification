package com.oracle2.java.application.main.inheritence.interfaces;


public class AppClassWithTwoInterface {
}

/*public class AppClassWithTwoInterface implements I1, I2 {
// Duplicate default methods named work with the parameters () and () are inherited from the types I2 and I1
}

public class AppClassWithTwoInterface extends ClassI2 implements I1 {
	// Duplicate default methods named work with the parameters () and () are inherited from the types I2 and I1
}*/

interface I1 {
	default void work() {System.out.println("work I1");}
}

interface I2 {
	default void work() {System.out.println("work I2");}
}

class ClassI2 implements I2 {
	
}


package com.oracle.java.application.main.inheritence;

public class ApplicationClassInterfaces implements I1,I2{

	@Override
	public void doI() {
			System.out.println("Do i");	
	}
	
	public static void main(String[] args) {
		new ApplicationClassInterfaces().doI();
	}

}

interface I1 {
	void doI();
}
interface I2 {
	void doI();
}

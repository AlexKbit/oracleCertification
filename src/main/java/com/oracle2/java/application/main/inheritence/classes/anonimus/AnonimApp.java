package com.oracle2.java.application.main.inheritence.classes.anonimus;

public class AnonimApp {
	
	public static void main(String[] s) {
		Anonim a1 = new Anonim() {
			public void work() {
				System.out.println("Anonim is work");
			}
		};
		a1.work();
		AAnonim a2 = new AAnonim("Hello") {
			void work() {
				System.out.println("Abstract Anonim is work");				
			}
		};
		a2.work();
	}

}

interface Anonim {
	public void work();
}

abstract class AAnonim {
	AAnonim(String msg) {System.out.println(msg);}
	abstract void work();
}
package com.oracle2.java.application.main.concurrency.threads;

public class AppThread {

	public static void main(String[] args) {
		Runnable r = () -> System.out.println("Runnable");
		Thread t = new Thread(r);
		t.start(); // work in new thread
		
		MyThread mt = new MyThread();
		mt.run(); // work in current thread
		mt.start(); // work in new thread
	}

}

class MyThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("MyThread");
	}
}

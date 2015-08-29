package com.oracle2.java.application.main.concurrency.blockingQueue;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class AppLinkedBlockingDeque {

	public static void main(String[] args) throws InterruptedException {
		BlockingDeque<String> deque = new LinkedBlockingDeque<>();
		deque.addFirst("a");
		deque.addLast("b");
		deque.addLast("c");
		String b = deque.takeLast();
		String a = deque.takeFirst();
		System.out.println(a+b);
	}

}

package com.oracle2.java.application.main.concurrency.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AppAtomic {

	public static void main(String[] args) throws Exception {
		AtomicInteger ai = new AtomicInteger(10);
		int val = ai.get(); // Get the value
		ai.set(15); // Set the value

		int expectedValue = 15;
		int newValue      = 20;
		// If the value of ai equals expectedValue, ai is set to newValue
		ai.compareAndSet(expectedValue, newValue);

		ai = new AtomicInteger(10);
		val = ai.getAndAdd(10); // val contains 10 but ai contains 20
		val = ai.addAndGet(10); // val and ai contain 30

		val = ai.getAndDecrement(); // val contains 30 but ai contains 29
		val = ai.decrementAndGet(); // val and ai contain 28

		val = ai.getAndIncrement(); // val contains 28 but ai contains 29
		val = ai.incrementAndGet(); // val and ai contain 30
		
		System.out.println("Atomic = " + ai.get() + " Value = "+val);
		System.out.println("======================================");
		
		ai = new AtomicInteger(10);
		ai.updateAndGet(i -> i * 5); // ai contains 50
		System.out.println("Atomic = " + ai.get() );
		val = ai.getAndUpdate(i -> i / 5); // ai contains 10
		System.out.println("Atomic = " + ai.get() + " Value = "+val);
		
		ai = new AtomicInteger(10);
		ai.accumulateAndGet(5, (a, b) -> a + b); // ai contains 15
		System.out.println("Atomic = " + ai.get() );
	}
}

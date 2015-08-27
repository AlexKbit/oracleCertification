package com.oracle2.java.application.main.concurrency.accumulator;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;
import java.util.stream.IntStream;

public class AppAccumulator {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newCachedThreadPool();
		LongAdder la = new LongAdder();
		IntStream.range(0, 1000).parallel()
		    .forEach(i -> executor.submit(la::increment)); //Adds one to la, 1000 times
		System.out.println(la.sum());   // la contains 1000 
		
		
		LongAccumulator acc = new LongAccumulator((a, b) -> a + b , 1L);
		ExecutorService executor2 = Executors.newFixedThreadPool(2);
		IntStream.range(0, 5)
		    .forEach(i -> executor2.submit(() -> acc.accumulate(i)));
		System.out.println(acc.getThenReset()); //acc contains 15
	}

}

package com.oracle2.java.application.main.concurrency.stream;

import java.util.concurrent.ForkJoinPool;
import java.util.stream.Stream;

public class AppConcurrencyStream {

	public static void main(String[] args) {

		ForkJoinPool commonPool = ForkJoinPool.commonPool();
		System.out.println("Cors: "+commonPool.getParallelism());
		
		// parallel show elements
		Stream.of("1", "2", "3").parallel().forEach(System.out::println);
		
		streamReduce();
	}
	
	public static void streamReduce() {
		System.out.println("Stream reduce");
		int sum = Stream.of(1,2,3,4,5,6,7).parallel().
				reduce(0, (x,y) -> x+y);
		System.out.println("Sum:"+sum);
		
		sum = Stream.of(1,2,3,4,5,6,7).parallel()
                .reduce(0, 
                  (s, x) -> s + x,
                  (x, y) -> x + y);
		System.out.println("Sum:"+sum);
	}

}

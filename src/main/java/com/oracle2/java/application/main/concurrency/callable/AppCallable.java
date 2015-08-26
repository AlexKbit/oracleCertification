package com.oracle2.java.application.main.concurrency.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AppCallable {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newSingleThreadExecutor();
	    Callable<Integer> c = () -> {
	          int n = 0;
	          for(int i = 0; i < 100; i++) { n += i; }
	          return n;
	      };
	    Future<Integer> future = executor.submit(c);
	    try {
	    	Integer result = future.get(); //waits for the thread to complete
	        System.out.println(result);
	    } catch (ExecutionException | InterruptedException e) {
	        e.printStackTrace();
	    }
	    executor.shutdown();
	}

}

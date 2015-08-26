package com.oracle2.java.application.main.concurrency.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AppInvokeAll {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		List<Callable<String>> callables = new ArrayList<Callable<String>>();
		callables.add(new Callable<String>() {
		    public String call() {
		        return "Callable 1";
		    }
		});
		callables.add(new Callable<String>() {
		    public String call() {
		        return "Callable 2";
		    }
		});
		callables.add(new Callable<String>() {
		    public String call() {
		        return "Callable 3";
		    }
		});
		List<Future<String>> futures = executorService.invokeAll(callables);
		for(Future<String> f : futures){
		    System.out.println(f.get());
		}
		executorService.shutdown();

	}

}

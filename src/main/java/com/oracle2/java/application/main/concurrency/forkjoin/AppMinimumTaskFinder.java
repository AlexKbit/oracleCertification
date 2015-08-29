package com.oracle2.java.application.main.concurrency.forkjoin;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class AppMinimumTaskFinder extends RecursiveTask<Integer> {
	
	private static final long serialVersionUID = -4033217968385567767L;

	private static final int SEQUENTIAL_THRESHOLD = 5;

	  private final int[] data;
	  private final int start;
	  private final int end;

	  public AppMinimumTaskFinder(int[] data, int start, int end) {
	    this.data = data;
	    this.start = start;
	    this.end = end;
	  }

	  public AppMinimumTaskFinder(int[] data) {
	    this(data, 0, data.length);
	  }

	  @Override
	  protected Integer compute() {
	    final int length = end - start;
	    if (length < SEQUENTIAL_THRESHOLD) {
	      return computeDirectly();
	    }
	    final int split = length / 2;
	    final AppMinimumTaskFinder left = new AppMinimumTaskFinder(data, start, start + split);
	    left.fork();
	    final AppMinimumTaskFinder right = new AppMinimumTaskFinder(data, start + split, end);
	    return Math.min(right.compute(), left.join());
	  }

	  private Integer computeDirectly() {
	    int min = Integer.MAX_VALUE;
	    for (int i = start; i < end; i++) {
	      if (data[i] < min) {
	        min = data[i];
	      }
	    }
	    return min;
	  }

	  public static void main(String[] args) {
	    int[] data = new int[10000];
	    Random random = new Random();
	    for (int i = 0; i < data.length; i++) {
	      data[i] = random.nextInt(1000);
	    }

	    ForkJoinPool pool = new ForkJoinPool();
	    AppMinimumTaskFinder task = new AppMinimumTaskFinder(data);
	    System.out.println("Min value: "+pool.invoke(task));
	  }
	}

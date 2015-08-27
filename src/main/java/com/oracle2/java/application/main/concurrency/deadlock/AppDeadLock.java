package com.oracle2.java.application.main.concurrency.deadlock;

public class AppDeadLock {

	public static Object lock1 = new Object();
	   public static Object lock2 = new Object();

	   public static void main(String args[]) {

	      Thread t1 = new Thread(new Task1());
	      Thread t2 = new Thread(new Task2());
	      t1.start();
	      t2.start();
	      
	      System.out.println("End main programm");
	   }

	   private static class Task1 implements Runnable {
	      public void run() {
	         synchronized (lock1) {
	            System.out.println("Task 1: Holding lock 1...");
	            try {
	              Thread.sleep(100);
	            }
	            catch (InterruptedException e) {}
	            System.out.println("Task 1: Waiting for lock 2...");
	            synchronized (lock2) {
	               System.out.println("Task 1: Holding lock 1 & 2...");
	            }
	         }
	      }
	   }

	   private static class Task2 implements Runnable {
	      public void run() {
	         synchronized (lock2) {
	            System.out.println("Task 2: Holding lock 2...");
	            try {
	              Thread.sleep(100);
	            }
	            catch (InterruptedException e) {}
	            System.out.println("Task 2: Waiting for lock 1...");
	            synchronized (lock1) {
	               System.out.println("Task 2: Holding lock 1 & 2...");
	            }
	         }
	      }
	   } 

}

package com.oracle2.java.application.main.concurrency.blockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class AppBlockingQueue {

	public static void main(String[] args) {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(1024);
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        new Thread(producer).start();
        new Thread(consumer).start();
        System.out.println("End main");
	}

}

class Producer implements Runnable {
    private BlockingQueue<String> queue = null;
    public Producer(BlockingQueue<String> queue) {
        this.queue = queue;
    }
    public void run() {
        try {
            // The sleeps calls will cause the Consumer to block while waiting for objects in the queue.
            queue.put("1");
            Thread.sleep(1000);
            queue.put("2");
            Thread.sleep(1000);
            queue.put("3");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer implements Runnable {
    private BlockingQueue<String> queue = null;
    public Consumer(BlockingQueue<String> queue) {
        this.queue = queue;
    }
    public void run() {
        try {
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
package com.oracle2.java.application.main.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

public class AppCyclicBarrier {
    public static void main(String args[]) {
        ServiceMan serviceMan = new ServiceMan(3);
 
        for (int i = 0; i < 5; i++) {
            new Thread(new Printer(serviceMan, "Printer" + (i + 1))).start();
        }
    }
}
 
class ServiceMan {
 
    private CyclicBarrier queue;
    private List<String> inQueue;
 
    public ServiceMan(int hardWorking) {
        inQueue = new ArrayList<String>();
        queue = new CyclicBarrier(hardWorking, new Runnable() {
            @Override
            public void run() {
                System.out.println("Filling " + inQueue);
                inQueue.clear();
            }
        });
    }
 
    public void recharge(String name) {
        try {
            inQueue.add(name);
            queue.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
 
}
 
class Printer implements Runnable {
 
    private String name;
    private Random rand;
    private ServiceMan serviceMan;
 
    public Printer(ServiceMan serviceMan, String name) {
        this.name = name;
        this.serviceMan = serviceMan;
        this.rand = new Random();
    }
 
    public void run() {
        try {
            while (true) {
                TimeUnit.SECONDS.sleep(rand.nextInt(10));
                System.out.println(name + " is empty");
                serviceMan.recharge(name);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
 
}

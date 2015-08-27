package com.oracle2.java.application.main.concurrency.synchronize;

public class AppSynchronized {

	public static void main(String[] args) throws Exception {

		new Thread(()-> ObjSyncronizeMethods.syncMethod1("Thread1")).start();
		new Thread(()-> ObjSyncronizeMethods.syncMethod2("Thread2")).start();
		
		new Thread(()-> ObjSyncronizeBlocks.syncMethod1("Thread1")).start();
		new Thread(()-> ObjSyncronizeBlocks.syncMethod2("Thread2")).start();
	}

}

class ObjSyncronizeMethods {
	
	// In this case syncMethod1 must be wait syncMethod2 and
	// syncMethod2 must be wait syncMethod1
	
	public static synchronized void syncMethod1(String name) {
		System.out.println("ObjSyncronizeMethods.syncMethod1 by "+name);
		try {
			Thread.sleep(2*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static synchronized void syncMethod2(String name) {
		System.out.println("ObjSyncronizeMethods.syncMethod2 by "+name);
		try {
			Thread.sleep(2*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}


class ObjSyncronizeBlocks {
	
	public static void syncMethod1(String name) {
		synchronized(name) {
			System.out.println("ObjSyncronizeBlocks.syncMethod1 by "+name);
			try {
				Thread.sleep(2*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void syncMethod2(String name) {
		synchronized(name) {
			System.out.println("ObjSyncronizeBlocks.syncMethod2 by "+name);
			try {
				Thread.sleep(2*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
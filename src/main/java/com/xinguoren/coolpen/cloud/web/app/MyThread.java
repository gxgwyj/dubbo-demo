package com.xinguoren.coolpen.cloud.web.app;

public class MyThread extends Thread {
	public void run(){
//		System.out.println("run=" + this.isAlive());
		try {
			System.out.println("run threadName=" + this.currentThread().getName() + " begin");
			Thread.sleep(2000);
			System.out.println("run threadName=" + this.currentThread().getName() + " end");
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}

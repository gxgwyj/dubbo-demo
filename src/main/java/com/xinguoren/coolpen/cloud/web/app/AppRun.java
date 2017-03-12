package com.xinguoren.coolpen.cloud.web.app;

public class AppRun {

	public static void main(String[] args){
//		MyThread myThread = new MyThread();
//		System.out.println("begin = " + myThread.isAlive());
//		myThread.start();
//		System.out.println("end = " + myThread.isAlive());
		MyThread myThread = new MyThread();
		System.out.println("begin = " + System.currentTimeMillis());
//		myThread.run();
		myThread.start();
		System.out.println("end = " + System.currentTimeMillis());
		
	}
}

package com.xinguoren.coolpen.cloud.web.app;

public class MyThread1 extends Thread{
	public void run(){
		super.run();
		for (int i = 0; i < 500; i++) {
			System.out.println("i=" + (i+1));
		}
	}
	public static void main(String[] args) {
		try {
			MyThread1 myThread1 = new MyThread1();
			myThread1.start();
			Thread.sleep(2000);
			myThread1.interrupt();
//			System.out.println("是否停止1? =" + myThread1.interrupted());
//			System.out.println("是否停止2? =" + myThread1.interrupted());
			System.out.println("是否停止1? =" + myThread1.isInterrupted());
			System.out.println("是否停止2? =" + myThread1.isInterrupted());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.err.println("main catch");
			e.printStackTrace();
		}
	}

}

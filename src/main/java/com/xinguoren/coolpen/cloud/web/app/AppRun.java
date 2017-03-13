package com.xinguoren.coolpen.cloud.web.app;

import java.util.ArrayList;
import java.util.List;

public class AppRun {

	public static void main(String[] args){
////		MyThread myThread = new MyThread();
////		System.out.println("begin = " + myThread.isAlive());
////		myThread.start();
////		System.out.println("end = " + myThread.isAlive());
//		MyThread myThread = new MyThread();
//		System.out.println("begin = " + System.currentTimeMillis());
////		myThread.run();
//		myThread.start();
//		System.out.println("end = " + System.currentTimeMillis());
		List<String> list = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>(5);
		
		for(int i = 0;i<10;i++){
			list.add(i+"");
		}
		for(int i = 0;i<5;i++){
			list2.add(i+"");
		}
		list.remove(3);
		list.remove(5);
		list.remove(5);
		for(int i = 0;i<list.size();i++){
			System.out.print(list.get(i)+" ");
		}
	}
}

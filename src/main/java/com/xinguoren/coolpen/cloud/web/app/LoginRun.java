package com.xinguoren.coolpen.cloud.web.app;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LoginRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread a = new LoginUser("a","aa");
		Thread b = new LoginUser("b","bb");
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(a);
		exec.execute(b);
		exec.shutdown();

	}

}

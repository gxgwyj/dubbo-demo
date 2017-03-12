package com.xinguoren.coolpen.cloud.web.app;

public class LoginUser extends Thread {
	private String username;
	private String password;
	
	public LoginUser(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public void run(){
		LoginServlet.doPost(username, password);
	}

}

package com.xinguoren.coolpen.cloud.web.app;

public class LoginServlet {
		private static String usernameRef;
		private static String passwordRef;
		
		public synchronized static void doPost(String username,String password){
			try {
				usernameRef = username;
				if("a".equals(username)){
					Thread.sleep(5000);
				}
				passwordRef = password;
				System.out.println("username=" + usernameRef + " password=" + password);
			} catch (InterruptedException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			
		}
}

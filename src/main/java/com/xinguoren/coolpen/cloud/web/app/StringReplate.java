package com.xinguoren.coolpen.cloud.web.app;

public class StringReplate {
	public static void main(String[] args) {
		String str = "abc bcs  add   123131 yuh12 asdfd";
		System.out.println(str.replaceAll("\\s+"," "));
	}

}

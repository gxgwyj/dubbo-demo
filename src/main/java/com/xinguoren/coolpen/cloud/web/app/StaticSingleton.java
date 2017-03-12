package com.xinguoren.coolpen.cloud.web.app;
/**
 * 最优的单例
 * @author Lenovo
 *
 */
public class StaticSingleton {
	/**
	 * 构造方法私有化
	 */
	private StaticSingleton() {
	}
	/**
	 * 静态内部类
	 * @author Lenovo
	 *
	 */
	private static class SingletonHolder{
		private static  StaticSingleton staticSingleton = new StaticSingleton();
	}
	
	public static StaticSingleton getInstance(){
		return SingletonHolder.staticSingleton;
	}
}

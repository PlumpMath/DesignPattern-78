package com.ygq.singletonpattern;

public class Singleton {

	//private static Single uniqueInstance = new Singleton() // eager initialize
	//lazy initialize
	private volatile static Singleton uniqueInstance;
	private Singleton() {
	}
	public static Singleton getInstance() {
		if (null == uniqueInstance) {
			synchronized (Singleton.class) {
				if (null == uniqueInstance) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
}

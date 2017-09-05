package com.wang.singleton;

public class SingleClass {
	private static SingleClass instance;
	private static Object lock=new Object();
	private SingleClass() {

	}

	public static SingleClass getInstance() {
		//同步实现
		if (instance == null)
			synchronized (lock) {
				if (instance == null) {
					instance = new SingleClass();
				}
			}
		return instance;

	}
	void printHash(){
		System.out.println(""+hashCode());
	}
}

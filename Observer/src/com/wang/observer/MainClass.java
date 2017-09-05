package com.wang.observer;

/**
 * 观察者模式
 * @author 58
 *
 */
public class MainClass {
	public static void main(String args[]){
		MyObservable obs=new MyObservable();
		MyObserver1 obse1=new MyObserver1();
		MyObserver2 obse2=new MyObserver2();
		obs.addObserver(obse1);
		obs.addObserver(obse2);
		obs.setMsg("123");
	
	}
}

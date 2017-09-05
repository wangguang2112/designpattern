package com.wang.facade;

/**
 * 外观模式
 * @author 58
 *隐藏底层实现，相当于一个调度器
 *类似适配器模式，不同的是适配器是一对一适配（新和旧一对一），而外观是一对多适配（使用和底层类为一对多），外观类充当调用的媒介
 *原始方法数是稳定的，进一步抽象就是桥接模式，
 */
public class MainClass {

	public static void main(String args[]){
		IFacade f=new Facade();
		f.printA();
		f.printB();
	}
}

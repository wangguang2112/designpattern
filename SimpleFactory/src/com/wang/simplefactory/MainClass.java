package com.wang.simplefactory;

/**
 * 简单工厂
 * @author 58
 *一个工厂内部判断产生不同对象 保证产品的不动
 */
public class MainClass {

	public static void main(String[] args) {
		Factory.create("1").print();
		Factory.create("2").print();
		boolean bool=true;
		System.out.printf("%d", 1 );
	}

}

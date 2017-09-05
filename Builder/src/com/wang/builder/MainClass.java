package com.wang.builder;

/**
 * 建造者模式 
 * @author 58
 *外部定义建造器 传入
 *可控制调用方式
 */
public class MainClass {


	public static void main(String[] args) {
		Factory.construct(new ABuilder()).print();
	}

}

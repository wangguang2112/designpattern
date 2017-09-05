package com.wang.FactoryMethod;

import com.wang.FactoryMethod.impl.IFactory;

/*
 * 工厂方法模式
 * @author wangguang
 * 抽象工厂与工厂方法的区别
 * 抽象工厂的创建方法比较多
 */
public class MainClass {
	public static void main(String[] args) {
		//两种情况
		IFactory factory=new OneFactory();
		factory.createProduct().print();
		IFactory factory2=new TwoFactory();
		factory2.createProduct().print();
	}
}

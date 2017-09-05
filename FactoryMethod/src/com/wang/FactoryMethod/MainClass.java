package com.wang.FactoryMethod;

import com.wang.FactoryMethod.impl.IFactory;

/*
 * ��������ģʽ
 * @author wangguang
 * ���󹤳��빤������������
 * ���󹤳��Ĵ��������Ƚ϶�
 */
public class MainClass {
	public static void main(String[] args) {
		//�������
		IFactory factory=new OneFactory();
		factory.createProduct().print();
		IFactory factory2=new TwoFactory();
		factory2.createProduct().print();
	}
}

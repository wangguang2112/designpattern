package com.wang.builder;

/**
 * ������ģʽ 
 * @author 58
 *�ⲿ���彨���� ����
 *�ɿ��Ƶ��÷�ʽ
 */
public class MainClass {


	public static void main(String[] args) {
		Factory.construct(new ABuilder()).print();
	}

}

package com.wang.simplefactory;

/**
 * �򵥹���
 * @author 58
 *һ�������ڲ��жϲ�����ͬ���� ��֤��Ʒ�Ĳ���
 */
public class MainClass {

	public static void main(String[] args) {
		Factory.create("1").print();
		Factory.create("2").print();
		boolean bool=true;
		System.out.printf("%d", 1 );
	}

}

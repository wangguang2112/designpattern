package com.wang.adapter;

/**
 * ������ģʽ
 * @author 58
 *
 */
public class MainClass {

	
	public static void main(String[] args) {
		ITarget t=new Adapter();
		t.newPrint();
	}

}

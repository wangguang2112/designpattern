package com.wang.state;

/**
 * ״̬ģʽ
 * @author 58
 *
 */
public class MainClass {
	public static void main(String args[]){
		Context context=new Context();
		context.nowState=new State1();
		context.request();
		context.nowState=new State2();
		context.request();
	}
}

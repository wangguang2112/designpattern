package com.wang.commond;
/**
 * ����ģʽ 
 * @author 58
 *androidʹ���ڶࣨ��Ϣ�ַ���
 */
public class MainClass implements IReceiver{
	
	
	@Override
	public void action(String a) {
		System.out.println(a);
	}
	public static  void main(String args[]){
		new Invoker().invoker(new MCommand(new MainClass()));
	}
}

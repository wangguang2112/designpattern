package com.wang.commond;
/**
 * 命令模式 
 * @author 58
 *android使用众多（消息分发）
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

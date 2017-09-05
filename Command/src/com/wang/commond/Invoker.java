package com.wang.commond;

public class Invoker {
	public Invoker() {
	}
	public void  invoker(ICommand c){
		c.excute();
	}
}

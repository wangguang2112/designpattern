package com.wang.proxy;

public class Proxy implements Subject {
	Subject s=new RealSubject();//不通过传参数
	public  Proxy() {
	}
	@Override
	public void Request() {
		System.out.println("Proxy :");
		s.Request();
	}

}

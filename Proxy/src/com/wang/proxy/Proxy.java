package com.wang.proxy;

public class Proxy implements Subject {
	Subject s=new RealSubject();//��ͨ��������
	public  Proxy() {
	}
	@Override
	public void Request() {
		System.out.println("Proxy :");
		s.Request();
	}

}

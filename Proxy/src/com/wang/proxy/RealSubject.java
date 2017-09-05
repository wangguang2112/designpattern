package com.wang.proxy;

public class RealSubject implements Subject {

	@Override
	public void Request() {
		System.out.println("nothing");
	}

}

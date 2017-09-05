package com.wang.flyweight;

//可以自己维护自己的对象池
//有一点违背开放-封闭原则
public class SharedFlyweightimp implements IFlyweight {
	String state;
	public SharedFlyweightimp(String state) {
		this.state=state;
	}
	@Override
	public void operation() {
		System.out.println("Share Hash:"+hashCode()+" state:"+state);
	}

}

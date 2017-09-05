package com.wang.flyweight;

public class UnsharedFlyweightimp implements IFlyweight {
	String state;
	public UnsharedFlyweightimp(String state) {
		this.state=state;
	}
	@Override
	public void operation() {
		System.out.println("Unshare  Hash:"+hashCode()+" state:"+state);
	}

}

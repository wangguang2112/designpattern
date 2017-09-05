package com.wang.adapter;

public class Adapter implements ITarget{
	IAdaptee a;
	public Adapter(){
		a=new Adaptee();
	}
	@Override
	public void newPrint() {
		a.oldPrint();
	}
}

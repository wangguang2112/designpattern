package com.wang.prototype;

public class OnePrototype implements ICloneable<OnePrototype> {
	String param1="123";
	String param2="345";
	public OnePrototype(String s1,String s2) {
		this.param1=s1;
		this.param2=s2;
	}
	@Override
	public OnePrototype clone1() {
		return new OnePrototype(param1,param2);
	}
	public void printHash(){
		System.out.println(""+hashCode());
	}
}

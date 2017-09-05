package com.wang.strategy;

public class Context {
	Strategy s;
	public Context(Strategy s) {
		this.s=s;
	}
	public void contextInterface(){
		s.algoritInterface();
	}
}

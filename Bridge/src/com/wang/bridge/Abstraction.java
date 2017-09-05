package com.wang.bridge;


public abstract class Abstraction {
	Implementor impl;
	public Abstraction(Implementor impl){
		this.impl=impl;
	}
	public abstract void operation();
}

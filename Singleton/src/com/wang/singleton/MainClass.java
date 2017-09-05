package com.wang.singleton;

public class MainClass {

	public static void main(String[] args) {
		SingleClass.getInstance().printHash();
		SingleClass.getInstance().printHash();
	}

}

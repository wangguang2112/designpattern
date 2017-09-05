package com.wang.builder;

public class AbsProduct {
	String result;

	void apend(String s) {
		if (result == null) {
			result = s;
		} else {
			result = result + s;
		}
	}

	void print() {
		System.out.println(result);
	}
}

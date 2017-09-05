package com.wang.simplefactory;

public class Factory {
	public static Product create(String tag) {
		if (tag.equals("1")) {
			return new Product() {

				@Override
				public void print() {
					System.out.println("1");
				}
			};
		} else {
			return new Product() {

				@Override
				public void print() {
					System.out.println("2");
				}
			};
		}
	}
}

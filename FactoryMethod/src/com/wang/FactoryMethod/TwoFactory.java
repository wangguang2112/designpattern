package com.wang.FactoryMethod;

import com.wang.FactoryMethod.impl.IFactory;
import com.wang.FactoryMethod.impl.IProduct;

public class TwoFactory implements IFactory {

	@Override
	public IProduct createProduct() {
		return new IProduct() {
			
			@Override
			public void print() {
				System.out.println("two");
			}
		};
	}

}

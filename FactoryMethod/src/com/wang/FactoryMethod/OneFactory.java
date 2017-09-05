package com.wang.FactoryMethod;

import com.wang.FactoryMethod.impl.IFactory;
import com.wang.FactoryMethod.impl.IProduct;

public class OneFactory implements IFactory {

	@Override
	public IProduct createProduct() {
		return new IProduct() {
			
			@Override
			public void print() {
				System.out.println("one");
			}
		};
	}

}

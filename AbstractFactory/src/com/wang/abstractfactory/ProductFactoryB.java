package com.wang.abstractfactory;

import com.wang.abstractfactory.impl.AbstractFactory;
import com.wang.abstractfactory.impl.AbstractProductA;
import com.wang.abstractfactory.impl.AbstractProductB;

public class ProductFactoryB implements AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		return new ProductA2();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB2();
	}

}

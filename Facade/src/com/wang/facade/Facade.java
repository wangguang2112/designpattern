package com.wang.facade;

public class Facade implements IFacade {
	SubmethodA a = new SubmethodA();
	SubmethodB b = new SubmethodB();

	@Override
	public void printA() {
		a.operateA();
	}

	@Override
	public void printB() {
		b.operateB();
	}

}

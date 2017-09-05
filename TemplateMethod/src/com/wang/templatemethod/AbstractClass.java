package com.wang.templatemethod;

public abstract class AbstractClass {

	void templateMethod() {
		primtiveOperation1();
		primtiveOperation2();
	}

	protected abstract void primtiveOperation1();

	protected abstract void primtiveOperation2();
}

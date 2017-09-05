package com.wang.templatemethod;

public class ConClass extends AbstractClass {

	@Override
	protected void primtiveOperation1() {
            System.out.println("延迟实现1");
	}

	@Override
	protected void primtiveOperation2() {
		  System.out.println("延迟实现2");
	}

}

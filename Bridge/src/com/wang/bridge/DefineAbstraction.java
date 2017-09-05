package com.wang.bridge;

public class DefineAbstraction extends Abstraction {

	public DefineAbstraction(Implementor impl) {
		super(impl);
	}

	@Override
	public void operation() {
		impl.OperationImp();
	}

}

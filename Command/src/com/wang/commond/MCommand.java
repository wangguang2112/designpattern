package com.wang.commond;

public class MCommand implements ICommand {
	IReceiver r;
	public MCommand(IReceiver r) {
		this.r=r;
	}
	@Override
	public void excute() {
		r.action("123");
	}

}

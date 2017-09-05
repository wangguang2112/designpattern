package com.wang.state;

public class Context {
	IState nowState;
	public void request(){
		nowState.handle();
	}
}

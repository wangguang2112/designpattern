package com.wang.observer;

import java.util.Observable;
import java.util.Observer;

public class MyObserver1 implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("1 get MSG"+arg);
	}

}

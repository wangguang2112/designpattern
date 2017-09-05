package com.wang.observer;

import java.util.Observable;
import java.util.Observer;

public class MyObserver2 implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("2 get MSG"+arg);
	}

}

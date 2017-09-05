package com.wang.observer;

import java.util.Observable;

/**
 * ∂‘”¶Subject
 * @author 58
 *
 */
public class MyObservable extends Observable {
	String msg="";
	void setMsg(String m){
		if (!msg.equals(m)) {
			setChanged();
		}
		msg = m;
		notifyObservers(msg);
		clearChanged();
	}
}

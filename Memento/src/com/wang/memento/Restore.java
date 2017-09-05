package com.wang.memento;

public class Restore {
	private Originator.Memento a;

	void saveState(Originator m) {
		this.a = m.createMemento();
	}

	void recoverState(Originator m) {
		if (a != null) {
			m.setMemento(a);
			a = null;
		}
	}
}

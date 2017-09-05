package com.wang.iterator;

public interface Iterator<A> {
	A first();
	A next();
	boolean hasNext();
	boolean isDone();
	A currentItem();
}

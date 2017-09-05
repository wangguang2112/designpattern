package com.wang.iterator;

public interface Aggregate<T>{
	 void put(T t);
	 Iterator<T> createIterator();
	 int lenght();
}

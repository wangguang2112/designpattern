package com.wang.memento;

public class Originator {
	int a=3;
	void setMemento(Memento m){
		this.a=m.as;
	}
	Memento createMemento(){
		return new Memento().setA(a);
	}
	 class Memento {
		private  int as=0;
		Memento setA(int as){
			this.as=as;
			return this;
		}
	}
	 public void operate(){
		a++;
	 }
	 void print(){
		 System.out.println("a="+a);
	 }
}

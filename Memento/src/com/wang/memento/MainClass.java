package com.wang.memento;
/**
 * ����¼ģʽ
 * @author 58
 *
 */
public class MainClass {

	public static void main(String args[]){
		Originator o=new Originator();
		Restore r=new Restore();
		o.print();
		r.saveState(o);
		o.operate();
		o.print();
		r.recoverState(o);
		o.print();
	}
}

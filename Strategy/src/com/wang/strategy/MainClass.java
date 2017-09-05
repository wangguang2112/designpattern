package com.wang.strategy;
/**
 * ²ßÂÔÄ£Ê½
 * @author 58
 *
 */
public class MainClass {
	public static void main(String args[]){
	Context c1=new Context(new ConcreStrategyA());
	c1.contextInterface();
	Context c2=new Context(new ConcreStrategyB());
	c2.contextInterface();
	Context c3=new Context(new ConcreStrategyC());
	c3.contextInterface();
	}
	
}

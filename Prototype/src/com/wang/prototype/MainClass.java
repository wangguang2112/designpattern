package com.wang.prototype;
/**
 * 原型模式
 * @author 58
 *
 */
public class MainClass {
	
	public static void main(String[] args) {
		OnePrototype i1=new OnePrototype("1", "2");
		i1.printHash();
		i1.clone1().printHash();
		one(String.class);
	}
	/**
	 * 方法范型
	 * @param c 想构建的话得有这个
	 * @return
	 */
	public static <T> T one(Class<T> c){
		try {
			return c.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
}

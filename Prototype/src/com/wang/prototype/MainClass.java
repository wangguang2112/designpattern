package com.wang.prototype;
/**
 * ԭ��ģʽ
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
	 * ��������
	 * @param c �빹���Ļ��������
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

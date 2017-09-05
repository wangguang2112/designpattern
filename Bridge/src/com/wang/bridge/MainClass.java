package com.wang.bridge;

/**
 * 桥接模式（聚合实现多继承）
 * @author 58
 *两个类的转换（InputStreamReader）
 *两个维度的变化时，即抽象层和实现层不同变化需求时
 *实现由继承转换为聚合关系（弱于组合关系）
 */
public class MainClass {

	public static void main(String[] args) {
		DefineAbstraction a=new DefineAbstraction(new ImplementA());
		a.operation();
	}
}

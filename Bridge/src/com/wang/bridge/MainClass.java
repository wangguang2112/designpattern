package com.wang.bridge;

/**
 * �Ž�ģʽ���ۺ�ʵ�ֶ�̳У�
 * @author 58
 *�������ת����InputStreamReader��
 *����ά�ȵı仯ʱ����������ʵ�ֲ㲻ͬ�仯����ʱ
 *ʵ���ɼ̳�ת��Ϊ�ۺϹ�ϵ��������Ϲ�ϵ��
 */
public class MainClass {

	public static void main(String[] args) {
		DefineAbstraction a=new DefineAbstraction(new ImplementA());
		a.operation();
	}
}

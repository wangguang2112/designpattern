package com.wang.facade;

/**
 * ���ģʽ
 * @author 58
 *���صײ�ʵ�֣��൱��һ��������
 *����������ģʽ����ͬ������������һ��һ���䣨�º;�һ��һ�����������һ�Զ����䣨ʹ�ú͵ײ���Ϊһ�Զࣩ�������䵱���õ�ý��
 *ԭʼ���������ȶ��ģ���һ����������Ž�ģʽ��
 */
public class MainClass {

	public static void main(String args[]){
		IFacade f=new Facade();
		f.printA();
		f.printB();
	}
}

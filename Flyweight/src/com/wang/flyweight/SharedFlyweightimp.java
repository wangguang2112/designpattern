package com.wang.flyweight;

//�����Լ�ά���Լ��Ķ����
//��һ��Υ������-���ԭ��
public class SharedFlyweightimp implements IFlyweight {
	String state;
	public SharedFlyweightimp(String state) {
		this.state=state;
	}
	@Override
	public void operation() {
		System.out.println("Share Hash:"+hashCode()+" state:"+state);
	}

}

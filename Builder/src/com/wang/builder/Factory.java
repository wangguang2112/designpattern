package com.wang.builder;

public class Factory {
	public static AbsProduct construct(IBuilder builder){
		builder.buildHead();	
		builder.buildFace();
		builder.buildMouth();
		builder.buildFoot();
		return builder.build();
	}
}

package com.wang.builder;

public interface IBuilder {
	void buildHead();
	void buildFace();
	void buildMouth();
	void buildFoot();
	AbsProduct build();
}

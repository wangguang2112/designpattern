package com.wang.Composite;

public interface IConposite extends ILeaf {
	public ILeaf add(ILeaf in);
	public void remove(ILeaf out);
	public int count();
	public  IConposite getCon(int index);
	public ILeaf getLeaf(int index);
}

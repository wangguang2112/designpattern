package com.wang.decorator;

public class BaseDecorator extends Component {
	protected Component co;
	public BaseDecorator(Component co) {
		this.co=co;
	}
	@Override
	public void opreate() {
		co.opreate();
		System.out.println("going");
	}
}

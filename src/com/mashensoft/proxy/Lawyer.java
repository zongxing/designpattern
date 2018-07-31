package com.mashensoft.proxy;

public class Lawyer implements ILaw{
	ILaw law;
	public Lawyer(ILaw law) {
		super();
		this.law = law;
	}
	@Override
	public void goToLaw() {
		System.out.println("准备证据");
		law.goToLaw();
		System.out.println("代理当事人法庭演讲");
	}

}

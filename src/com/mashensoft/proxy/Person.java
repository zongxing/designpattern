package com.mashensoft.proxy;

public class Person implements ILaw{

	@Override
	public void goToLaw() {
		System.out.println("老百姓发起诉讼");
	}

}

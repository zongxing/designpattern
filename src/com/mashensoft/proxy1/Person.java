package com.mashensoft.proxy1;

public class Person implements IBuyHouse {
	@Override
	public void buy() {
		System.out.println("老百姓花钱买房子");
	}
}

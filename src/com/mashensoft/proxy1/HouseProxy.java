package com.mashensoft.proxy1;

public class HouseProxy implements IBuyHouse {
	Person person;
	public HouseProxy(Person person) {
		super();
		this.person = person;
	}
	@Override
	public void buy() {
		System.out.println("代理联系卖家");
		person.buy();
		System.out.println("代理收佣金");
	}
}

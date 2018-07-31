package com.mashensoft.mediator;

public class Test {
	public static void main(String[] args) {
		IMediator mediator = new MediatorImpl();
		mediator.workAll();
	}
}

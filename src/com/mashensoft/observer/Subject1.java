package com.mashensoft.observer;

public class Subject1 extends AbstractSubject {
	@Override
	public void opration() {
		System.out.println("通知");
		notifyObservers();
	}
}

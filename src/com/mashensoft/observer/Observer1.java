package com.mashensoft.observer;

public class Observer1 implements Observer{

	@Override
	public void update() {
		System.out.println("观察者一收到通知，做出回应");
	}

}

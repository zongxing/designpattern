package com.mashensoft.observer;

public class Observer2 implements Observer{

	@Override
	public void update() {
		System.out.println("观察者二收到通知，做出回应");
	}

}
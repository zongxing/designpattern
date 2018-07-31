package com.mashensoft.observer;

import java.util.Vector;
import java.util.Enumeration;

public abstract class AbstractSubject implements Subject {
	private Vector<Observer> vector = new Vector<Observer>();

	@Override
	public void add(Observer observer) {
		vector.add(observer);
	}

	@Override
	public void delete(Observer observer) {
		vector.remove(observer);
	}

	@Override
	public void notifyObservers() {
		Enumeration<Observer> enu = vector.elements();
		while (enu.hasMoreElements()) {
			enu.nextElement().update();
		}
	}
	public void opration(){
		System.out.println("执行任务");
		notifyObservers();
	}
}

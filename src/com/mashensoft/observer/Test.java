package com.mashensoft.observer;

public class Test {
	public static void main(String[] args) {
		Subject1 subject1  = new Subject1();
		Observer1 o1 = new Observer1();
		Observer2 o2 = new Observer2();
		subject1.add(o1);
		subject1.add(o2);
		subject1.opration();
	}
}

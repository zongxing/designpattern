package com.mashensoft.strategy;

public class Test {
	public static void main(String[] args) {
		AbstractCalculator cal = new Plus();
		System.out.println(cal.calculate("10+2"));
		cal = new Minus();
		System.out.println(cal.calculate("10-2"));
	}
}

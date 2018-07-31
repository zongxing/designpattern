package com.mashensoft.strategy;

public class Minus extends AbstractCalculator {
	@Override
	public int calculate(String sourceStr) {
		int array[] = split(sourceStr, "-");
		return array[0]-array[1];
	}

}

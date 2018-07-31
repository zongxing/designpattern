package com.mashensoft.strategy;

public abstract class AbstractCalculator implements ICalculator{
	public int[] split(String sourceStr,String splitStr){
		String array[] = sourceStr.split(splitStr);
		int returnIntArray[] = new int[2];
		returnIntArray[0] = Integer.parseInt(array[0]);
		returnIntArray[1] = Integer.parseInt(array[1]);
		return returnIntArray;
	}
}

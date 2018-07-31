package com.mashensoft.chain;

public class Test {
	public static void main(String[] args) {
		RealHandler h1 = new RealHandler("h1");
		RealHandler h2 = new RealHandler("h2");
		RealHandler h3 = new RealHandler("h3");
		h1.setNextHandler(h2);
		h2.setNextHandler(h3);
		h1.operator();
	}
	
}

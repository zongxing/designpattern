package com.mashensoft.chain;

public abstract class AbstractHandler implements IHandler {
	IHandler nextHandler;
	public IHandler getNextHandler() {
		return nextHandler;
	}
	public void setNextHandler(IHandler nextHandler) {
		this.nextHandler = nextHandler;
	}


	
}

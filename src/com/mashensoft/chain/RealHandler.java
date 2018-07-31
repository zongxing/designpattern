package com.mashensoft.chain;

public class RealHandler extends AbstractHandler implements IHandler {
	private String name;

	public RealHandler(String name) {
		this.name = name;
	}
	@Override
	public void operator() {
		System.out.println(name+"操作");
		if(this.getNextHandler()!=null){
			getNextHandler().operator();
		}
	}

}

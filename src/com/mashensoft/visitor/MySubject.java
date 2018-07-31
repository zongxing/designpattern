package com.mashensoft.visitor;

public class MySubject implements Subject{

	@Override
	public void accept(Visitor vistor) {
		vistor.visit(this);
	}

	@Override
	public String getSubject() {
		return "固定的数据";
	}
	
}

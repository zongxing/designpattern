package com.mashensoft.visitor;

public class MyVisitor implements Visitor{

	@Override
	public void visit(Subject subject) {
		String value = subject.getSubject();
		System.out.println("访问数据："+value);
		
	}

}

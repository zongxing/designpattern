package com.mashensoft.interpreter;

public class Test {
	public static void main(String[] args) {
		Context context1 = new Context(20, 10);
		int result = new Minus().interpret(context1);
		context1 = new Context(result,20);
		int result2 = new Plus().interpret(context1);
		System.out.println(result2);
		//获取用如下一行代码完成
		System.out.println(new Plus().interpret(new Context(new Minus().interpret(new Context(20, 10)), 20)));
	}
}

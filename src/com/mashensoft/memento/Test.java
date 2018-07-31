package com.mashensoft.memento;

public class Test {
	public static void main(String[] args) {
		Original original = new Original("西瓜");
		Memento memento = original.createMemento();
		original.createMemento();
		System.out.println("原始的值："+original.getValue());
		original.setValue("南瓜");
		System.out.println("修改后的值："+original.getValue());
		original.restoreMemento(memento);
		System.out.println("恢复后的值："+original.getValue());
	}
}

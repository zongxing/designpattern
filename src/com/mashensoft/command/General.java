package com.mashensoft.command;

public class General {
	IMessenger messager;
	public General(IMessenger messager) {
		this.messager = messager;
	}
	public void doSomeCommand(){
		System.out.println("将军想干某件事");
		messager.exec();
	}
}

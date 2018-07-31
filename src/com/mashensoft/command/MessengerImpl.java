package com.mashensoft.command;

public class MessengerImpl implements IMessenger{
	ICommand command;

	public MessengerImpl(ICommand command) {
		this.command = command;
	}
	public void exec(){
		System.out.println("传令兵传递命令");
		command.doCommand();
	}
	
}

package com.mashensoft.command;

public class Soldier implements ICommand {

	@Override
	public void doCommand() {
		System.out.println("士兵执行命令");
	}

}

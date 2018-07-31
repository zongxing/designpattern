package com.mashensoft.command;

public class Test {
	public static void main(String[] args) {
		ICommand soldier = new Soldier();
		IMessenger messenger = new MessengerImpl(soldier);
		General badun = new General(messenger);
		badun.doSomeCommand();
	}
}

package com.mashensoft.facade;

public class Computer {
	Cpu cpu;
	Ram ram;
	Disk disk;
	public Computer(Cpu cpu, Ram ram, Disk disk) {
		this.cpu = cpu;
		this.ram = ram;
		this.disk = disk;
	}
	public void startup(){
		this.cpu.startup();
		this.ram.startup();
		this.disk.startup();
	}
	public void shutdown(){
		this.cpu.shutdown();
		this.ram.shutdown();
		this.disk.shutdown();
	}
}

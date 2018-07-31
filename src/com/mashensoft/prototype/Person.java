package com.mashensoft.prototype;

public class Person implements Cloneable{
	private String username;
	private int age;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

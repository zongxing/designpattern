package com.mashensoft.prototype;

public class Test {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setUsername("mashensoft");
		p1.setAge(18);
		try {
			Person p2 = (Person)p1.clone();
			System.out.println(p1 == p2);
			System.out.println(p1.getUsername() == p2.getUsername());
			System.out.println(p1.getAge() == p2.getAge());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}

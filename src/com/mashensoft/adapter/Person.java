package com.mashensoft.adapter;

public class Person {
	//静态内部类
	static class Hand{
		public static void beat(){
			System.out.println("beat");
		}
	}
	public static void main(String[] args) {
		Person.Hand.beat();
	}
}

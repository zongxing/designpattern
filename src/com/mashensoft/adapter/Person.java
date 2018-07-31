package com.mashensoft.adapter;

public class Person {
	static class Hand{
		public static void beat(){
			System.out.println("beat");
		}
	}
	public static void main(String[] args) {
		Person.Hand.beat();
	}
}

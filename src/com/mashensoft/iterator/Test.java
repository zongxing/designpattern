package com.mashensoft.iterator;

public class Test {
	public static void main(String[] args) {
		MyCollection coll = new MyCollection();
		Iterator it = coll.iterator();
		while(it.hasNext()){
			String str = (String)it.next();
			System.out.println(str);
		}
	}
}

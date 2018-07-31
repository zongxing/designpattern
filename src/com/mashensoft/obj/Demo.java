package com.mashensoft.obj;

public class Demo implements Cloneable{
	String idcard;
	
	@Override
	public boolean equals(Object obj) {
		Demo demo = (Demo)obj;
		return demo.idcard.equals(this.idcard);
	}

	public Demo(String idcard) {
		this.idcard = idcard;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public static void main(String[] args) {
		Demo d1  = new Demo("aa");
		Demo d2  = new Demo("aa");
		System.out.println(d1.equals(d2));
		System.out.println(d1.hashCode());
		System.out.println(d1.hashCode());
		try {
			Demo d3 = (Demo) d1.clone();
			System.out.println(d1==d3);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}

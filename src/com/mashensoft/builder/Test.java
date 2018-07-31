package com.mashensoft.builder;

import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		KFCFoodBuilder builder = new KFCFoodBuilder(new SetMealProduct());
		FirstDirector fd = new FirstDirector(builder);
		SetMealProduct smp = fd.construct();
		Iterator it = smp.getFoodList().iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		builder = new KFCFoodBuilder(new SetMealProduct());
		SecondDirector sd = new SecondDirector(builder);
		smp = fd.construct();
		 it = smp.getFoodList().iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}

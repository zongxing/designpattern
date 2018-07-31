package com.mashensoft.builder;

public class FirstDirector {
	private AbstractFoodBuilder fb;

	public FirstDirector(AbstractFoodBuilder fb) {
		this.fb = fb;
	}

	public SetMealProduct construct() {
		System.out.println("套餐一");
		fb.buildChips(); // 薯条
		fb.buildHamburg(); // 汉堡
		fb.buildCola(); // 可乐
		return fb.getResult();
	}

}

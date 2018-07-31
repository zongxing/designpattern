package com.mashensoft.builder;

public class SecondDirector {
	private AbstractFoodBuilder fb;
	 
    public SecondDirector(AbstractFoodBuilder fb) {
        this.fb = fb;
    }
 
    public SetMealProduct construct() {
    	System.out.println("套餐二");
        fb.buildChickenRolls(); // 鸡肉卷
        fb.buildChips(); // 薯条
        fb.buildCola(); // 可乐
        return fb .getResult();
    }

}

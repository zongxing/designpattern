package com.mashensoft.builder;

public abstract class AbstractFoodBuilder {
    // 套餐
    protected SetMealProduct sm = new SetMealProduct();
    
	public AbstractFoodBuilder(SetMealProduct sm) {
		this.sm = sm;
	}
	// 创建汉堡
    public abstract void buildHamburg();
    // 创建薯条
    public abstract void buildChips();
    // 创建可乐
    public abstract void buildCola();
    // 创建鸡肉卷
    public abstract void buildChickenRolls();
    public SetMealProduct getResult() {
        return sm ;
    }

}

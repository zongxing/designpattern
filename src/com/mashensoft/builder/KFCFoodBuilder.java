package com.mashensoft.builder;

public class KFCFoodBuilder extends AbstractFoodBuilder {
	
	public KFCFoodBuilder(SetMealProduct sm) {
		super(sm);
	}
	@Override
	public void buildHamburg() {
		System.out.println("肯德基生产汉堡");
		sm.getFoodList().add("汉堡");
	}
	@Override
	public void buildChips() {
		System.out.println("肯德基生产薯条");
		sm.getFoodList().add("薯条");
	}
	@Override
	public void buildCola() {
		System.out.println("肯德基生产可乐");
		sm.getFoodList().add("可乐");
	}
	@Override
	public void buildChickenRolls() {
		System.out.println("肯德基生产鸡肉卷");
		sm.getFoodList().add("鸡肉卷");
	}
}

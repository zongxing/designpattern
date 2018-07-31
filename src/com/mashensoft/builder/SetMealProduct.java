package com.mashensoft.builder;

import java.util.ArrayList;
import java.util.List;
public class SetMealProduct {
	// 套餐名称
	private String name;
	// 套餐中的食品集合
	private List<String> foodList = new ArrayList<String>();

	public List<String> getFoodList() {
		return foodList;
	}
	public void setFoodList(List<String> foodList) {
		this.foodList = foodList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

package com.mashensoft.method;

public abstract class Emploee {
	// 工作方法。内部包含了其他方法
	public void workimg() {
		buyElectricity();
		buyComputer();
		buyNetwork();
		coding();
		getMoney();
	}

	// 购买电
	public void buyElectricity() {

	}

	// 购买网络
	public void buyNetwork() {

	}

	// 写代码
	public abstract void coding();

	// 购买电脑
	public void buyComputer() {

	}

	// 写好软件，把软件卖掉，赚到钱
	public void getMoney() {

	}
}

package com.mashensoft.io;

public class President3 {
	/**
	 * 定义一个静态的变量
	 */
	private static President3 president;
	/**
	 * 此类只有一个私有的构造函数，此方法只能被自己的类调用实例化。
	 */
	private President3() {

	}
	/**
	 * 如果总统实例为null，则创建一个新的对象。如果已经创建过，则把已经创建好的对象返回。
	 * @return 一个对象
	 */
	public synchronized President3 createPresident() {
		if (president == null) {
			president = new President3();
		}
		return president;
	}
}

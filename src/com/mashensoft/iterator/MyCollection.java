package com.mashensoft.iterator;

public class MyCollection implements ICollection {
	private String[] myArray = new String[]{"a","c","d","b"};
	@Override
	public Iterator iterator() {
		return new MyIterator(this);
	}
	@Override
	public Object get(int i) {
		//如果在数组范围内，就返回指定的对象。对象从0开始
		if(i>=0&&i<myArray.length){
			return myArray[i];
		}
		//如果不在指定范围内，返回null
		return null;
	}

	@Override
	public int size() {
		return myArray.length;
	}

}

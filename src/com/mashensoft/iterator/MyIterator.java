package com.mashensoft.iterator;

public class MyIterator implements Iterator {
	ICollection collection;
	int pos = -1;
	public MyIterator(ICollection collection) {
		this.collection = collection;
	}

	@Override
	public Object previous() {
		if(pos>0){
			pos--;
		}
		return collection.get(pos);
	}

	@Override
	public Object next() {
		if(pos<collection.size()){
			pos++;
		}
		return collection.get(pos);
	}

	@Override
	public boolean hasNext() {
		if(pos<collection.size()-1){
			return true;
		}
		return false;
	}

	@Override
	public Object first() {
		
		return collection.get(0);
	}

}

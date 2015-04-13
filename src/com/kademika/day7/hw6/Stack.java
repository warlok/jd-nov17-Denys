package com.kademika.day7.hw6;

import java.util.ArrayList;
import java.util.Iterator;

public class Stack implements Iterable<Object> {

	java.util.List<Object> stackStrukture;
	
	private class StackIterator implements Iterator<Object> {

		private int cp = -1;

		public StackIterator() {

		}

		public Object next() {
			
			
			if (hasNext()) {
				cp++;
				return stackStrukture.get(cp);
			}

			throw new IllegalStateException("No more Elements");
			
		}

		public boolean hasNext() {
			if ((cp+1) < stackStrukture.size() && stackStrukture.get(cp+1) != null) {
				return true;
			}
			return false;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub

		}

	}
	
	public Stack() {
		stackStrukture = new ArrayList<>();
	}
	
	public void push(Object o) {
		int index = stackStrukture.size();
		stackStrukture.add(index, o);
	}
	
	public Object pop() {
		int index = stackStrukture.size();
		Object element = stackStrukture.get(index-1);
		stackStrukture.remove(index-1);
		return element;
	}
	
	public Object peak() {
		int index = stackStrukture.size();
		Object element = stackStrukture.get(index-1);
		return element;
	}

	@Override
	public Iterator<Object> iterator() {
		return new StackIterator();
	}
	
}

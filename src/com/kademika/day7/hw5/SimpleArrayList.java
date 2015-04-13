package com.kademika.day7.hw5;

import java.util.Iterator;

class SimpleArrayList implements Iterable<Object> {

	Object[] myList = new Object[1];
	private int size;

	private class SLLIterator implements Iterator<Object> {

		private int cp = -1;

		public SLLIterator() {

		}

		public Object next() {
			
			
			if (hasNext()) {
				cp++;
				return myList[cp];
			}

			throw new IllegalStateException("No more Elements");
			
		}

		public boolean hasNext() {
			if ((cp+1) < myList.length && myList[cp+1] != null) {
				return true;
			}
			return false;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub

		}

	}

	public void printList() {
		for (Object o : myList) {
			if (o != null && o instanceof String) {
				System.out.print( (String) o + " ");
			}
		}
		System.out.println();
	}

	public void addFirst(Object o) {

		if (myList[0] == null) {
			myList[0] = o;
		} else {
			Object[] newList = new Object[myList.length + 1];
			newList[0] = o;
			for (int i = 0; i < myList.length; i++) {
				newList[i + 1] = myList[i];
			}
			myList = newList;
		}
		size++;
	}

	public void addLast(Object o) {

		if (myList[0] == null) {
			myList[0] = o;
		} else {
			Object[] newList = new Object[myList.length + 1];
			newList[myList.length] = o;
			for (int i = 0; i < myList.length; i++) {
				newList[i] = myList[i];
			}
			myList = newList;
		}

		size++;

	}

	public void addAfter(Object o, Object a) {

		Object[] newList = new Object[myList.length + 1];
		int i = 0;
		for (; i < myList.length; i++) {
			newList[i] = myList[i];
			if (o.equals(myList[i])) {
				newList[i + 1] = a;
				for (i = i + 1; i < myList.length; i++) {
					newList[i + 1] = myList[i];
				}

				myList = newList;
				size++;
				break;
			}
//			if (i != 0) {
//				newList[i + 1] = a;
//				for (i = i + 1; i < myList.length; i++) {
//					newList[i + 1] = myList[i];
//				}
//
//				myList = newList;
//				size++;
//			}
		}
	}

	public void remove(Object o) {
		Object[] newList = new Object[myList.length - 1];
		int i = 0;
		for (; i < myList.length-1; i++) {
			newList[i] = myList[i];
			if (o.equals(myList[i])) {
				for (; i < myList.length-1; i++) {
					newList[i] = myList[i + 1];
				}
				myList = newList;
				size--;
				break;
			}
			if (o.equals(myList[myList.length-1])) {
				for (i=0; i < myList.length-1; i++) {
					newList[i] = myList[i];
				}
				myList = newList;
				size--;
			}
//			if (i != 0) {
//				for (; i < myList.length - 1; i++) {
//					newList[i] = myList[i + 1];
//				}
//				myList = newList;
//				size--;
//			}
		}
	}

	public int getSize() {
		return size;
	}

	@Override
	public Iterator<Object> iterator() {
		return new SLLIterator();
	}

}

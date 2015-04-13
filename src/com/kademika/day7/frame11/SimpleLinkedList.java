package com.kademika.day7.frame11;

class SimpleLinkedList {

	private class Node {

		Object obj;
		Node ref;
		
		public Object getObject() {
			return obj;
		}

	}

	private Node root;
	private int size;

	public Object getRoot() {
		return root.getObject();
	}
	
	public void addFirst(Object o) {

		Node newNode = new Node();
		newNode.obj = o;
		if (root != null) {
			newNode.ref = root;
		}
		root = newNode;
		size++;
	}

	public void addLast(Object o) {
		
	}

	public void addAfter(Object o, Object a) {

	}

	public int getSize() {
		return size;
	}
	// public int getSize() {
	// int i = 0;
	// if (root != null) {
	// Node newNode = root;
	// do {
	// newNode = newNode.getNode();
	// i++;
	// } while (newNode != null);
	// }
	// return i;
	// }

}

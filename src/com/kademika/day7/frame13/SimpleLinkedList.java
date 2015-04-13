package com.kademika.day7.frame13;

import java.lang.Exception;


class SimpleLinkedList {

	private class Node {

		Object obj;
		Node ref;

		public Object getObject() {
			return obj;
		}

		public Node getRef() {
			return ref;
		}
	}

	private Node root;
	private int size;

	public void printList() {
		String stringList = "";
		Node node = new Node();
		node = root;
		if (root.getRef() != null) {
			while (node != null) {
				stringList += (String) node.getObject() + " ";
				node = node.getRef();
			}
			System.out.println(stringList);
		} else {
			System.out.println((String) root.getObject());
		}
	}

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
		
		Node n = new Node();
		n.obj = o;
		Node newNode = root;
		if (root != null) {
			
			for (int i=0; i<size-1; i++) {
			newNode = newNode.ref;
			}
			newNode.ref = n;
		} else {
			root = n;
		}
		size++;
		
	}

	public void addAfter(Object o, Object a) {
		Node n = new Node();
		n.obj = a;
		Node newNode = root;
		while (true) {
			if (newNode == null) {
				root = n;
				size++;
			} else if (newNode.obj.equals(o)) {
				n.ref = newNode.ref;
				newNode.ref = n;
				size++;
				break;
			} else if (newNode.ref == null) {
				throw new IllegalStateException();
			}
			newNode = newNode.ref;
		}

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

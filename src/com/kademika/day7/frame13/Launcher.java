package com.kademika.day7.frame13;

class Launcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleLinkedList list = new SimpleLinkedList();
		list.addFirst("test1");
		list.addLast("test3");
		list.printList();
		list.addAfter("test1", "test2");
		list.addAfter("test3", "test4");
		list.addAfter("test0", "test5");
		list.printList();
	}

}

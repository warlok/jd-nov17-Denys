package com.kademika.day7.frame15;

class Launcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleLinkedList list = new SimpleLinkedList();
		list.addFirst("first");
		list.addLast("second");
		list.addLast("third");
		list.addLast("quadre");
		list.addLast("five");
		list.addLast("six");
		list.printList();
		list.remove("six");
		list.printList();
	}

}

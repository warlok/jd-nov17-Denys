package com.kademika.day7.frame14;

class Launcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleLinkedList list = new SimpleLinkedList();
		list.addFirst("first");
		list.addLast("second");
		list.addLast("third");
		list.printList();
		for (Object o : list) {
			String s = (String) o;
			System.out.println(s);
		}
	}

}

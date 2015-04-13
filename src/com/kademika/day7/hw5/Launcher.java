package com.kademika.day7.hw5;

import java.util.Arrays;

class Launcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleArrayList list = new SimpleArrayList();
		list.printList();
		list.addFirst("first");
		list.printList();
		list.addLast("second");
		list.printList();
		list.addLast("third");
		list.printList();
		list.addAfter("second","newSecond");
		list.printList();
		list.addLast("five");
		list.printList();
		list.addFirst("first2");
		list.printList();
		list.addLast("six");
		list.printList();
		list.remove("six");
		list.printList();
		list.remove("second");
		list.printList();
		list.remove("third");
		list.printList();
		list.remove("first2");
		list.printList();
		
		for (Object o : list) {
			System.out.println( (String) o);
		}
	}

}

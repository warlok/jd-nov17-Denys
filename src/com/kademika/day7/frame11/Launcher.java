package com.kademika.day7.frame11;

class Launcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleLinkedList list = new SimpleLinkedList();
		list.addFirst("tets");
		System.out.println(list.getRoot());
		list.addFirst("lets");
		System.out.println(list.getRoot());
		list.addFirst("fets");
		System.out.println(list.getRoot());
		System.out.println(list.getSize());

	}

}

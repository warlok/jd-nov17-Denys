package com.kademika.day7.frame12;

class Launcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleLinkedList list = new SimpleLinkedList();
//		list.addFirst("tets");
//		list.printList();
//		list.addFirst("lets");
//		list.printList();
//		list.addFirst("fets");
//		list.printList();
//		list.addFirst("zets");
//		list.printList();
		list.addLast("Fuck");
		list.printList();
		list.addLast("Fuck");
		list.printList();
		list.addFirst("zets");
		list.printList();
		list.addFirst("zets2");
		list.printList();
		list.addLast("Fuck2");
		list.printList();
		System.out.println(list.getSize());

	}

}

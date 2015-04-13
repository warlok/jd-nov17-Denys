package com.kademika.day7.frame17;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

	class Launcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Comparator comp = new Comparator();
		ArrayList list = new ArrayList<>();
		list.add("B");
		list.add("V");
		list.add("H");
		list.add("Z");
		list.add("O");
		list.add("S");
		list.add("A");
		list.add("L");
		list.add("J");
		list.add("U");
		list.add("N");
		list.add("X");
		list.add("C");
		list.add("F");
		list.add("R");
		list.add("D");
		list.add("I");
		printList(list);
		Collections.sort(list, comp);
		System.out.println();
		printList(list);
		
		
	}
	
	public static void printList(ArrayList list) {
		for (Object o : list) {
			System.out.print(o);
		}
	}

}

package com.kademika.library;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Finder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Library lib = new Library();
		lib.loadBooks();
		

		System.out.println(lib.findByAutor("Isdjncksd"));
		System.out.println(lib.findByGenre(Genre.FOOD));
		System.out.println();
		System.out.println(lib.findByGenre(Genre.FOOD));
		System.out.println(lib.findByName("Xdnkcs"));
		
	}
}

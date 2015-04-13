package com.kademika.library;

public class Library {

	public String catalog = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // 26 Chars

	// Name, Autor, Genre
	private Book[][][] lib = new Book[3][26][30];
	private int countStartsGenre = 0;

	public void loadBooks() {

		Book book1 = new Book("Fucking", "Adjncksd", Genre.COMPUTERS);
		Book book2 = new Book("Adnkcs", "Isdjncksd", Genre.FANTASY);
		Book book3 = new Book("Udnkcs", "Osdjncksd", Genre.FICTION);
		Book book4 = new Book("Xdnkcs", "Rsdjncksd", Genre.FOOD);
		Book book5 = new Book("Usdkcnsdk", "Nsdjncksd", Genre.FOOD);
		Book book6 = new Book("Xdnkcs", "Nksd", Genre.FOOD);
		Book book7 = new Book("Osdlk", "Nckjdcnds", Genre.FOOD);
		Book book8 = new Book("Xdnkcs", "Nmxcksd", Genre.FOOD);
		Book book9 = new Book("KDVN", "Nsdjncksd", Genre.FOOD);
		Book book10 = new Book("Osdlk", "Rsdjncksd", Genre.FOOD);
		Book book11 = new Book("LKRJN", "Njncksd", Genre.FOOD);
		Book book12 = new Book("Sdnkcs", "Adjncksd", Genre.COMPUTERS);
		Book book13 = new Book("Adnkcs", "Isdjncksd", Genre.FANTASY);
		Book book14 = new Book("Udnkcs", "Osdjncksd", Genre.FICTION);
		Book book15 = new Book("Xdnkcs", "Rsdjncksd", Genre.FOOD);
		Book book16 = new Book("Usdkcnsdk", "Nsdjncksd", Genre.FOOD);
		Book book17 = new Book("Xdnkcs", "Nksd", Genre.FOOD);
		Book book18 = new Book("Osdlk", "Nckjdcnds", Genre.FOOD);
		Book book19 = new Book("Xdnkcs", "Nmxcksd", Genre.FOOD);
		Book book20 = new Book("KDVN", "Nsdjncksd", Genre.FOOD);
		Book book21 = new Book("Osdlk", "Rsdjncksd", Genre.FOOD);
		Book book22 = new Book("LKRJN", "Njncksd", Genre.FOOD);

		addToLib(book1);
		addToLib(book2);
		addToLib(book3);
		addToLib(book4);
		addToLib(book5);
		addToLib(book6);
		addToLib(book7);
		addToLib(book8);
		addToLib(book9);
		addToLib(book10);
		addToLib(book11);
		addToLib(book12);
		addToLib(book13);
		addToLib(book14);
		addToLib(book15);
		addToLib(book16);
		addToLib(book17);
		addToLib(book18);
		addToLib(book19);
		addToLib(book20);
		addToLib(book21);
		addToLib(book22);

	}

	public void addToLib(Book book) {
		if (book != null && !book.getAutor().isEmpty()
				&& !book.getName().isEmpty()) {
			addByName(book);
			addByAutor(book);
			addByGenre(book);
		}

	}

	public void addByName(Book book) {

		int i = catalog.indexOf(book.getName().charAt(0));
		for (int counter = 0; counter < lib[0][i].length; counter++) {
			if (lib[0][i][counter] == null) {
				lib[0][i][counter] = book;
				break;
			}
		}
	}

	public void addByAutor(Book book) {

		int i = catalog.indexOf(book.getAutor().charAt(0));
		for (int counter = 0; counter < lib[1][i].length; counter++) {
			if (lib[1][i][counter] == null) {
				lib[1][i][counter] = book;
				break;
			}
		}
	}

	// public int swapAutor(Book[] books, int i) {
	// for (; i < books.length - 1; i++) {
	// if (books[i] != null
	// && books[i + 1] != null
	// && books[i].getAutor().compareTo(books[i + 1].getAutor()) > 0) {
	// Book bufer = books[i];
	// books[i] = books[i + 1];
	// books[i + 1] = bufer;
	// }
	// }
	// return i;
	// }
	//
	// public int swapAutor(Book[] books) {
	// int result = books.length;
	// for (int i = 0; i < books.length - 1; i++) {
	// if (books[i] != null
	// && books[i + 1] != null
	// && books[i].getAutor().compareTo(books[i + 1].getAutor()) < 0) {
	// Book bufer = books[i];
	// books[i] = books[i + 1];
	// books[i + 1] = bufer;
	// result = i + 1;
	// }
	// }
	// return result;
	//
	// }
	//
	// public void sortByAutor(Book[] books) {
	// int i = swapAutor(books);
	// while (i < books.length) {
	// i = swapAutor(books, i);
	// }
	// }

	public void addByGenre(Book book) {
		int genreID = book.getGenre().ordinal();
		for (int i = 0; i < lib[2][genreID].length; i++) {
			if (lib[2][genreID][i] == null) {
				lib[2][genreID][i] = book;
				break;
			}
		}
	}

	public String findByAutor(String name) {
		String result = "";
		int index = catalog.indexOf(name.charAt(0));
		int i = 1;
		for (Book book : lib[1][index]) {
			if (book != null && book.getAutor().equals(name)) {
				result += i + ". " + "Name: " + book.getName() + "\n";
				i++;
			} /*
			 * else if (i > 1) { break; }
			 */
		}
		return result;
	}

	public String findByName(String name) {
		String result = "";
		int index = catalog.indexOf(name.charAt(0));
		int i = 1;
		for (Book book : lib[0][index]) {
			if (book != null && book.getName().equals(name)) {
				result += i + ". " + "Autor: " + book.getAutor() + " Name: "
						+ book.getName() + "\n";
				i++;
			}
		}
		return result;
	}

	public String findByGenre(Genre genre) {
		String result = "";
		int index = genre.ordinal();
		int i = 5 * countStartsGenre;
		for (int c = i; c < i + 5; c++) {

			if (c >= lib[2][index].length) {
				return result;
			}

			if (lib[2][index][c] != null) {
				result += (c + 1) + ". " + "Autor: "
						+ lib[2][index][c].getAutor() + " Name: "
						+ lib[2][index][c].getName() + " genre: " + genre
						+ "\n";
				// i++;
			}
		}
		countStartsGenre++;
		return result;
	}

}

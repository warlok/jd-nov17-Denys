package com.kademika.library;

public class Book {

	private String name;
	private String autor;
	private Genre genre;
 
	public Book(String name, String autor, Genre genre) {
		this.name = name;
		this.autor = autor;
		this.genre = genre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
}

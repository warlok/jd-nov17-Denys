package com.kademika.day9.f10;

import java.util.ArrayList;

public class Newspaper extends ThePress {

	public Newspaper() {
		type = "Newspaper";
		observers = new ArrayList<>();
	}

	public Newspaper(String title, int numberOfPages, double price) {
		super(title, numberOfPages, price);
		type = "Newspaper";
		observers = new ArrayList<>();
	}


	
}

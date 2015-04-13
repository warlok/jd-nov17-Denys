package com.kademika.day9.f12;

import java.util.ArrayList;

public class Newspaper extends ThePress {

	public Newspaper() {
		type = "Newspaper";
	}

	public Newspaper(String title, int numberOfPages, double price) {
		super(title, numberOfPages, price);
		type = "Newspaper";
	}


	
}

package com.kademika.day9.f12;

public class Magazine extends ThePress {

	public Magazine() {
		type = "Magazine";
	}

	public Magazine(String title, int numberOfPages, double price) {
		super(title, numberOfPages, price);
		type = "Magazine";
	}
	
	
	
}

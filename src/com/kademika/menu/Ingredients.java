package com.kademika.menu;

public enum Ingredients {

	// Price for a portion
	MILK(0.5), WATER(0), SHUGAR(0.5), GREEN_TEE(1), BLACK_TEE(1), COFFEE(1.5), BERGAMOT(0.5), CREAM(0.5), CINNAMON(0.5), CHOCOLATE(1);
	
	private double price;	
	
	private Ingredients(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}

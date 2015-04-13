package com.kademika.day9.f12;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public abstract class ThePress extends Observable  {

	protected String title;
	protected int	numberOfPages;
	protected double price;
	protected String type;
//	protected List<Observer> observers;
//	protected int prevVersion;
//	protected int version;
	
	public ThePress() {
//		observers = new ArrayList<>();
	}
	
	public ThePress(String title, int	numberOfPages, double price) {
		this.price = price;
		this.numberOfPages = numberOfPages;
		this.title = title;
//		observers = new ArrayList<>();
	}
	
	public void publishNew() {
		setChanged();
		notifyObservers(this);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}

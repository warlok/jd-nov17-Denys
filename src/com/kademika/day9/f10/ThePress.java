package com.kademika.day9.f10;

import java.util.ArrayList;
import java.util.List;


public abstract class ThePress implements Subject {

	protected String title;
	protected int	numberOfPages;
	protected double price;
	protected String type;
	protected List<Observer> observers;
	protected int prevVersion;
	protected int version;
	
	public ThePress() {
		observers = new ArrayList<>();
	}
	
	public ThePress(String title, int	numberOfPages, double price) {
		this.price = price;
		this.numberOfPages = numberOfPages;
		this.title = title;
		observers = new ArrayList<>();
	}
	
	public void publishNew() {
		prevVersion = version;
		version++;
		notifyObserver();
	}

	public void add(Observer o) {
		observers.add(o);
	}

	public void remove(Observer o) {
		observers.remove(o);
		
	}

	public void notifyObserver() {
		if (version > prevVersion) {
			for (Observer o : observers) {
				o.update(this);
			}
			prevVersion = version;
		}
		
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

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}

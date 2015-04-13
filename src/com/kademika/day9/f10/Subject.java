package com.kademika.day9.f10;

public interface Subject {

	public void add(Observer o);
	public void remove(Observer o);
	public void notifyObserver();
	
	
}

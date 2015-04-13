package com.kademika.day9.f12;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import com.kademika.day9.f10.ThePress;

public class Subscriber implements Observer {

	
	private String name;
	private List<com.kademika.day9.f12.ThePress> press;
	
	public Subscriber() {
		press = new ArrayList<>();
	}

	public Subscriber(String name) {
		this.name = name;
		press = new ArrayList<>();
	}
	
	@Override
	public void update(Observable o, Object arg) {
		com.kademika.day9.f12.ThePress p = (com.kademika.day9.f12.ThePress) arg;
		System.out.println(name + " was notified for new publish of "
				+ p.getType() + " " + p.getTitle());
		
	}

	public void sybscribe(com.kademika.day9.f12.ThePress p) {
		press.add(p);
		p.addObserver(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

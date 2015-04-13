package com.kademika.day9.f10;

import java.util.ArrayList;
import java.util.List;

public class Subscriber implements Observer {

	private String name;
	private List<ThePress> press;

	public Subscriber() {
		press = new ArrayList<>();
	}

	public Subscriber(String name) {
		this.name = name;
		press = new ArrayList<>();
	}

	@Override
	public void update(ThePress p) {
		System.out.println(name + " was notified for new publish of "
				+ p.getType() + " " + p.getTitle() + " - " + p.getVersion());
	}

	public void sybscribe(ThePress p) {
		press.add(p);
		p.add(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

package com.kademika.day7.frame7;

public class Student {

	private String name;
	private String SecondName;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSecondName() {
		return SecondName;
	}
	public void setSecondName(String secondName) {
		SecondName = secondName;
	}
	
	@Override
	public boolean equals(Object st) {
		if (((Student) st).name == name && ((Student) st).SecondName == SecondName) {
			return true;
		}
		
		return false;
	}
	
}

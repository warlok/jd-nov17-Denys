package com.kademika.day7.frame23;

public class Person {

	String name;
	int age;
	long salary;
	
	@Override
	public int hashCode() {
		Integer ageInt = (Integer) age;
		Long salaryLong = (Long) salary;
		int result = 7;
		result = 37*result + ageInt.hashCode();
		result = 37*result + salaryLong.hashCode();
		result = 37*result + name.hashCode();
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		Person object = (Person) obj;
		if (name.equals(object.name) && age == object.age && salary == object.salary) {
			return true;
		}
		return false;
	}
}

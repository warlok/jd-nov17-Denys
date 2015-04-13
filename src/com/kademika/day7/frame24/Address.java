package com.kademika.day7.frame24;

public class Address {

	String city;
	String streeet;
	int house;
	
	@Override
	public int hashCode() {
		Integer houseInt = (Integer) house;
		int result = 32;
		result = 37*result + city.hashCode();
		result = 37*result + streeet.hashCode();
		result = 37*result + houseInt.hashCode();
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		Address object = (Address) obj;
		if (city.equals(object.city) && streeet.equals(object.streeet) && house == object.house) {
			return true;
		}
		return false;
	}
}

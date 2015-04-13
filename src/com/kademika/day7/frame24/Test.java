package com.kademika.day7.frame24;

class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Address adr = new Address();
		Address adr1 = new Address();
		adr.city = "Kie";
		adr.house = 7;
		adr.streeet = "Brayton";
		adr1.city = "Kiev1";
		adr1.house = 8;
		adr1.streeet = "Brayton";
		Person person1 = new Person();
		Person person2 = new Person();
		person1.age = 20;
		person1.name = "Denys";
		person1.salary = 3000;
		person1.address = adr;
		person2.age = 20;
		person2.name = "Denys";
		person2.salary = 3000;
		person2.address = adr;
		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());
	}

}

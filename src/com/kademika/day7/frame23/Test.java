package com.kademika.day7.frame23;

class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person();
		person1.age = 20;
		person1.name = "Denys";
		person1.salary = 3000;
		person2.age = 21;
		person2.name = "Denys";
		person2.salary = 3000;
		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());
	}

}

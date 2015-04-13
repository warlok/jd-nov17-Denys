package com.kademika.day7.frame25;

import java.util.HashMap;

public class TestHashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person Denys = new Person();
		Denys.name = "Denys";
		Person Vasya = new Person();
		Vasya.name = "Vasya";
		Person Kolya = new Person();
		Kolya.name = "Kolya";
		Person Oleg = new Person();
		Oleg.name = "Oleg";
		Person Andrey = new Person();
		Andrey.name = "Andrey";
		
		HashMap<String, Person> test = new HashMap<>();
		test.put(Denys.name, Denys);
		test.put(Vasya.name, Vasya);
		test.put(Kolya.name, Kolya);
		test.put(Oleg.name, Oleg);
		test.put(Andrey.name, Andrey);
	
		getKeys(test);
		
		getObjectsByKey(test);
		
		
//		test.
//		for (Object o : test.entrySet()) {
//			
//			if (o != null) {
//				Entry obj = (Entry) o;
//				System.out.println(obj.name);
//			}
//			
//		}
	
		

	}

	private static void getObjectsByKey(HashMap<String, Person> test) {
		for (Object o : test.keySet()) {
			Person obj = (Person) test.get(o);
			System.out.println(obj.name);
		}
	}

	private static void getKeys(HashMap<String, Person> test) {
		for (Object o : test.keySet()) {
			String obj = (String) o;
			System.out.println(obj);
		}
		
		
	}

}

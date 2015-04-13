package com.kademika.day5.hw4;

import java.util.LinkedList;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Market m = new Market();
		
		Customer oleg = new Customer();
		oleg.setName("Oleg");
		Customer denys = new Customer();
		denys.setName("Denys");
		Customer vasil = new Customer();
		vasil.setName("Vasil");
		Customer maks = new Customer();
		maks.setName("Maksim");
		Customer andrey = new Customer();
		andrey.setName("Andrey");
		
		Animal tiger = new Animal();
		tiger.setName("tiger");
		tiger.setOrder("Carnivora"); // Hishnik
		tiger.setType(Type.Mammal); // Mlekopitauhee
		tiger.setPrice(500);
		m.addAnimal(tiger);
		m.addOnStore(tiger, 5);

		Animal rabbit = new Animal();
		rabbit.setName("rabbit");
		rabbit.setOrder("Lagomorpha"); // Zytseobraznie
		rabbit.setType(Type.Mammal); // Mlekopitauhee
		rabbit.setPrice(10);
		m.addAnimal(rabbit);
		m.addOnStore(rabbit, 45);

		Animal raccoon = new Animal();
		raccoon.setName("raccoon");
		raccoon.setOrder("Carnivora");
		raccoon.setType(Type.Mammal);
		raccoon.setPrice(100);
		m.addAnimal(raccoon);
		m.addOnStore(raccoon, 10);

		Animal penguin = new Animal();
		penguin.setName("penguin");
		penguin.setOrder("Sphenisciformes");
		penguin.setType(Type.Bird);
		penguin.setPrice(80);
		m.addAnimal(penguin);
		m.addOnStore(penguin, 15);

		Animal chameleon = new Animal();
		chameleon.setName("chameleon");
		chameleon.setOrder("Squamata");
		chameleon.setType(Type.Reptile);
		chameleon.setPrice(20);
		m.addAnimal(chameleon);
		m.addOnStore(chameleon, 20);

		Animal iguana = new Animal();
		iguana.setName("iguana");
		iguana.setOrder("Squamata");
		iguana.setType(Type.Reptile);
		iguana.setPrice(30);
		m.addAnimal(iguana);
		m.addOnStore(iguana, 25);

		Animal owl = new Animal();
		owl.setName("owl");
		owl.setOrder("Strigiformes"); // Zaytseobraznie
		owl.setType(Type.Bird);
		owl.setPrice(30);
		m.addAnimal(owl);
		m.addOnStore(owl, 40);

		Animal parrot = new Animal();
		parrot.setName("parrot");
		parrot.setOrder("Psittaciformes");
		parrot.setType(Type.Bird);
		parrot.setPrice(10);
		m.addAnimal(parrot);
		m.addOnStore(parrot, 15);

		Animal sunfish = new Animal();
		sunfish.setName("sunfish");
		sunfish.setOrder("Tetraodontiformes"); // Kostnie
		sunfish.setType(Type.Fish);
		sunfish.setPrice(2000);
		m.addAnimal(sunfish);
		m.addOnStore(sunfish, 5);

		Animal boa = new Animal();
		boa.setName("boa");
		boa.setOrder("Squamata");
		boa.setType(Type.Reptile);
		boa.setPrice(100);
		m.addAnimal(boa);
		m.addOnStore(boa, 10);

		Animal frog = new Animal();
		frog.setName("frog");
		frog.setOrder("Anura");
		frog.setType(Type.Amphibian);
		frog.setPrice(15);
		m.addAnimal(frog);
		m.addOnStore(frog, 20);

		Animal aligator = new Animal();
		aligator.setName("aligator");
		aligator.setOrder("Crocodilia");
		aligator.setType(Type.Reptile);
		aligator.setPrice(500);
		m.addAnimal(aligator);
		m.addOnStore(aligator, 4);

		Animal newt = new Animal();
		newt.setName("newt");
		newt.setOrder("Caudata");
		newt.setType(Type.Amphibian);
		newt.setPrice(5);
		m.addAnimal(newt);
		m.addOnStore(newt, 50);

//			m.printCatalog();
//			m.printPrices();
//			m.printStore();
		m.printStore();
		System.out.println(denys.getAmountPurchases());
		System.out.println(denys.getSpendMoney());
		System.out.println();
		System.out.println();
		
		denys.addOnBucket(aligator,1);
		denys.addOnBucket(newt, 10);
		m.sell("Today", denys, denys.getBucket());
		
		System.out.println(denys.getAmountPurchases());
		System.out.println(denys.getSpendMoney());
		m.printStore();
		m.sell("Today", denys, denys.getBucket());
		System.out.println(denys.getAmountPurchases());
		System.out.println(denys.getSpendMoney());
		m.printStore();
		
		m.printTransactions();
	}
	
}

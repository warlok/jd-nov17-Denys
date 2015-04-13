package com.kademika.day8.frame16;

import java.io.ObjectOutputStream.PutField;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ArrayList;

public class Market {
	
	private Store store = new Store();
	private ArrayList<Purchase> purchases = new ArrayList<>();
	
	public Market() {

	}

	public void addAnimal(Animal a) {
		store.addAnimal(a);
	}

	public void removeAnimal(Animal a) {
		store.delAnimal(a);
	}

	public void addOnStore(Animal a, int n) {
		store.getOnStore(a, n);
	}

	public void sell(String day, Customer cust, LinkedList<Animal> goods) {
		double price = 0;
		if (goods != null) {
		for (Animal a : goods) {
			store.takeFromStore(a);
			price += a.getPrice();
		}
		purchases.add(new Purchase(day,cust,goods,price));
		cust.spendMoney(price);
		cust.addPurchase();
		cust.clearBucket();
		} else {System.out.println("Bucket is empty");}
	}

//	public void sell(Animal a) {
//		store.takeFromStore(a);
//	}

	public void addOnStore(Animal a) {
		store.getOnStore(a, 1);
	}
	
	public void printPrices() {
		for (Animal a : store.getAnimals()) {
			System.out.println("Name: " + a.getName() + "\tPrice: " + a.getPrice());
		}
	}
	
	public void printCatalog() {
		
		ArrayList<Animal> anim = (ArrayList<Animal>) store.getAnimals().clone();
		Collections.sort(anim);
		Type category = null;
		for (Animal a : anim) {
			
			if (a.getType() != category) {
				category = a.getType();
				System.out.println();
				System.out.println("Class: " + category);
			}
			System.out.println("Name: " + a.getName() + "\tPrice: " + a.getPrice() + "\tOrder: " + a.getOrder());
		}
		}
	
	public void printStore() {
		store.printStore();
	}
	
	public String getGoodsNames(LinkedList<Animal> a) {
		String result = "";
		for (int i=0, j=1; i < a.size(); i++) {
			if (i == 0) {
                result += a.get(i).getName();
            } else if (a.get(i).equals(a.get(i-1))) {
                j++;
            } else {
                result += "(x" + j +  "), " + a.get(i).getName();
                j=1;
            }
		}
		return result;
	}
	
	public void printTransactions() {
		int i = 1;
		for (Purchase pur : purchases) {
			if (pur.getDate().equals("Today")) {
				System.out.println(i + ". " + pur.getCustomer().getName() + " " + getGoodsNames(pur.getGoods()) + "\tPrice: " + pur.getPrice());
				i++;
			}
		}
	}


	// makeADiscount(int disc);

}

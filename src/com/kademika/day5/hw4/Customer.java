package com.kademika.day5.hw4;

import java.util.LinkedList;

public class Customer {

	private String name;
	private int amountPurchases;
	private double spendMoney;
	private Bucket bucket = new Bucket();

	public Customer() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmountPurchases() {
		return amountPurchases;
	}

	public double getSpendMoney() {
		return spendMoney;
	}

	public void addPurchase() {
		amountPurchases++;
	}

	public void spendMoney(double SpendMoney) {
		this.spendMoney += SpendMoney;
	}

	public void addOnBucket(Animal a, int n) {
		bucket.add(a, n);
	}

	public void addOnBucket(Animal a) {
		bucket.add(a);
	}
	
	public void delFromBucket(Animal a, int n) {
		bucket.del(a, n);
	}

	public void delFromBucket(Animal a) {
		bucket.del(a);
	}

	public LinkedList<Animal> getBucket() {
		return bucket.getBucket();
	}
	
	public void clearBucket() {
//		bucket.clear();
		bucket = new Bucket();
	}

}

package com.kademika.day5.hw4;

import java.util.LinkedList;

public class Bucket {

	public Bucket() {

	}

	private LinkedList<Animal> bucket = new LinkedList<>();

	public void add(Animal a) {
		bucket.add(a);
	}

	public void add(Animal a, int n) {
		for (int i = 0; i < n; i++) {
			bucket.add(a);
		}
	}

	public void del(Animal a) {
		bucket.remove(a);
	}

	public void del(Animal a, int n) {
		for (int i = 0; i < n; i++) {
			if (bucket.contains(a)) {
				bucket.remove(a);
			}
		}
	}

	public LinkedList<Animal> getBucket() {
		return bucket;
	}
	
	public void clear() {
		bucket.removeAll(bucket);
	}

}

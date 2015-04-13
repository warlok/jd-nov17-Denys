package com.kademika.day9.f12;

class Demo {

	public static void main(String args[]) {
		
		Newspaper komsomoskaPravda = new Newspaper("Komsomolska Pravda", 10, 3.50);
		Newspaper times = new Newspaper("Times", 25, 10.0);
		Newspaper vesty = new Newspaper("Vesty", 30, 4.50);
		Newspaper segodnya = new Newspaper("Segodnya", 15, 3.0);
		Magazine telenedelya = new Magazine("Telenedelya", 50, 15);
		Magazine sport = new Magazine("Sport", 100, 20);
		Magazine sciense = new Magazine("Sciense", 100, 30);
		
		Subscriber oleg = new Subscriber("Oleg");
		Subscriber denys = new Subscriber("Denys");
		Subscriber vasil = new Subscriber("Vasya");
		Subscriber nick = new Subscriber("Nick");
		
		oleg.sybscribe(komsomoskaPravda);
		oleg.sybscribe(sciense);
		denys.sybscribe(segodnya);
		denys.sybscribe(sport);
		vasil.sybscribe(times);
		nick.sybscribe(vesty);
		nick.sybscribe(telenedelya);
		nick.sybscribe(times);
		
		komsomoskaPravda.publishNew();
		times.publishNew();
		sport.publishNew();
		komsomoskaPravda.publishNew();
		segodnya.publishNew();
		sciense.publishNew();
		
	}
}

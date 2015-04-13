package com.kademika.day7.frame5;

public class Launcher {

	public static void main(String[] args) {
		Classroom myClass = new Classroom();
		Student valera = new Student();
		valera.setName("Valera");
		valera.setSecondName("Linsky");
		
		Student den = new Student();
		den.setName("Denys");
		den.setSecondName("Bes");
		
		Student juk = new Student();
		juk.setName("Oleg");
		juk.setSecondName("Urchenko");
		
		myClass.enter(valera);
		myClass.enter(juk);
		System.out.println(myClass.getStudentCount());
		System.out.println(myClass.getStudents());
		System.out.println(myClass.printStudentInfo());
		System.out.println(myClass.isPresent("Denys", "Bes"));
		myClass.leave(juk);
		System.out.println(myClass.isPresent("Oleg", "Urchenko"));
		
	}

}

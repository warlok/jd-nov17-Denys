package com.kademika.day7.frame5;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class Classroom {

	private List<Student> students = new ArrayList<>();

	public void enter(Student st) {
		students.add(st);
	}

	public void leave(Student st) {
		students.remove(st);
	}

	public int getStudentCount() {
		int count = students.size();
		return count;
	}

	public boolean isPresent(String nam,String secName) {
		for (Student student : students) {
			if (student != null && student.getName().equals(nam) && student.getSecondName().equals(secName)) {
				return true;
			}
		}
		return false;
	}

	public String printStudentInfo() {
		String info = "";
		for (Student student : students) {
			info += "Name: " + student.getName() + " Second Name: "
					+ student.getSecondName() + "\n";
		}
		return info;
	}

	public String getStudents() {
		String stList = "";
		for (Student student : students) {
			stList += student.getName() + " ";
		}
		return stList.trim();
	}
}

package com.kademika.day8.frame14;

import java.util.GregorianCalendar;
import java.util.Calendar;

public class MyCalendar {

	public static void main(String[] args) {
		
	Calendar cal = new GregorianCalendar();
	cal.set(1989, 8, 23);
	System.out.println(cal.get(Calendar.DAY_OF_WEEK));
	
	}
	
}

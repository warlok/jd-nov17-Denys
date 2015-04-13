package com.kademika.day8.frame13;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateOf {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
	
		Date date = new Date(1989,7,23);
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
		System.out.println(sdf.format(date));
		date = sdf.parse("23 Aug 1989");
		System.out.println(sdf.format(date));
		
	}

}

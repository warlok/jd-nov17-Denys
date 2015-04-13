package com.kademika.day7.frame17;

public class Comparator implements java.util.Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		String alphbet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String o1_new = (String) o1;
		String o2_new = (String) o2;
		if (alphbet.indexOf(o1_new) > alphbet.indexOf(o2_new)) {
		return -1;	
		} else if (alphbet.indexOf(o1_new) == alphbet.indexOf(o2_new)) {
			return 0;
		} 
		return 1;
	}

}

package com.rts.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetClass {

	public static void main(String[] args) {
		
		System.out.println("Linked HashSet class...");
		
		LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add("A");
		lhs.add("M");
		lhs.add("B");
		lhs.add("A");
		lhs.add("N");
		System.out.println("null added.");
		lhs.add("");
		lhs.add("I");
		
		System.out.println("Contents as per insertion order are = " +lhs);
		
		
		
	}

}

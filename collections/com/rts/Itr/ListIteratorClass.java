package com.rts.Itr;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorClass {
	
	public static void main(String args[]) {
		
		ListIterator li1 = null;
		
		List l1 = new ArrayList<>();
		
		l1.add("P");
		l1.add("R");
		l1.add("A");
		l1.add("T");
		l1.add("I");
		l1.add("K");
		
		System.out.println(l1);
		
		li1 = l1.listIterator();
		
		System.out.println("fw direction");

		while(li1.hasNext()) {
			System.out.println("Contents are = " +li1.next());
		}

		System.out.println("Backward direction");

		while(li1.hasPrevious()) {
			System.out.println("Contents are = " +li1.previous());
		}
		

	}
	
	
	
}

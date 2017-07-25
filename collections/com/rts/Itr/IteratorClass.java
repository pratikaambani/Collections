package com.rts.Itr;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorClass {

	public static void main(String[] args) {
		
		ArrayList names = new ArrayList<>(4);
		
		System.out.println("Size = "+names.size());
		
		names.add("Pratik");
		names.add("Bhavik");
		names.add("Ambani");
		names.add("Test");
		
		System.out.println("Size = "+names.size());
		System.out.println("Contents are = " +names);
		
		Iterator it1 = names.iterator();
		
		while(it1.hasNext()) {
			System.out.print(it1.next());
			System.out.print(" and ");
			
		}
		
	}

}

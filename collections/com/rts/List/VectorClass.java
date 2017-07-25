package com.rts.List;

import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Vector;

public class VectorClass {

	public static void main(String args[]) {
		Vector v1 = new Vector();

		System.out.println("Contents are = "+v1);
		System.out.println("Size = " +v1.size());
		System.out.println("Capasity = " +v1.capacity());
		
		java.util.Date date = new Date();
		int dat = date.getDay();
		for(int i=0; i<10; i++) {
			v1.add(date);
		}
		
		System.out.println("Size = " +v1.size());
		System.out.println("Capasity = " +v1.capacity());
		
		v1.add("Time");
		
		System.out.println(v1);
		System.out.println("Size = " +v1.size());
		System.out.println("Capasity = " +v1.capacity());
		
		System.out.println();
		
		Vector v2 = new Vector();
		
		v2.add("P");
		v2.add("R");
		v2.add("A");
		v2.add("T");
		v2.add("I");
		v2.add("K");
		
		System.out.println("Contents = " +v2);
		Collections.sort(v2);
		System.out.println("Sorted Contents = " +v2);
		
		v2.remove("A");
		System.out.println("Contents = " +v2);
		

	}
}

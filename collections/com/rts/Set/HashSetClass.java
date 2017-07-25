package com.rts.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetClass {

	public static void main(String[] args) {
		
		System.out.println("HashSet Class");
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("P");
		hs.add("R");
		hs.add("A");
		hs.add("T");
		hs.add("I");
		hs.add("K");
		
		System.out.println("Accepts null");
		hs.add("");
		
		
		System.out.println("Contents = " +hs);
		
		System.out.println("Size = " +hs.size());
		
		
		hs.clear(); 		
		System.out.println("Contents = " +hs);
		
		
		hs.add("A");
		hs.add("M");
		hs.add("B");
		hs.add("A");
		hs.add("N");
		hs.add("I");
		
		hs.addAll(hs);
		
		System.out.println(hs);
		
//		Object[] al1 = hs.toArray();
//		System.out.println(al1.getClass());
		
		Iterator i1 = hs.iterator();
		
/*		while(i1.hasNext()) {
			System.out.println(i1.next());			
		}*/
		
		for (String s : hs) {
			System.out.println(s);
		}
		
		
		List l1 = new ArrayList<>(hs);
		System.out.println(l1);

	}

}

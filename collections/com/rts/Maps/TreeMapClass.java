package com.rts.Maps;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap tM1 = new TreeMap<>();
//		Map tM1 = new TreeMap<>(Collections.reverseOrder());

		tM1.put(0, "P");
		tM1.put(-1, "R");
		tM1.put(2, "A");
		tM1.put(1, "T");
		tM1.put(4, "I");
		tM1.put(5, "K");
		tM1.put(6, "A");

		System.out.println(tM1);
		
		
		
		// Map sortByVal = sortByValue(tM1);

		Set s = tM1.entrySet();

		Iterator i1 = s.iterator();

		while (i1.hasNext()) {

			Map.Entry mE = (Map.Entry) i1.next();
			System.out.println("Key = " + mE.getKey() + " and Value = "
					+ mE.getValue());
		}
		
		System.out.println("tM1 = " +tM1);
		SortedMap<String, String> sM1 = tM1.subMap(2, 5);
		System.out.println("sM1 = " +sM1);
		
		System.out.println("Size = " +sM1.size());
		sM1.remove(4);
		System.out.println("Size = " +sM1.size());
		
		System.out.println("sM1 = " +sM1);
		
		System.out.println("tM1 = " +tM1);
		

	}

}

package com.rts.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {

		int a = 10;
		final int b = 20;
//		b += 20;
		
		
		
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();

		System.out.println(hm1);

		System.out.println("Initial Size = " + hm1.size());

		System.out.println("is empty ? = " + hm1.isEmpty());

		hm1.put(1, "A");
		hm1.put(2, "M");
		hm1.put(3, "B");
		hm1.put(4, "A");
		hm1.put(1, "N");
		hm1.put(6, "I");
		hm1.put(7, null);

		System.out.println("Now Size = " + hm1.size());

		System.out.println(" HM Contents are = " + hm1);

		System.out.println("HM keyset = " + hm1.keySet());
		System.out.println("HM values = " + hm1.values());

		Set<?> s1 = hm1.entrySet();
		System.out.println("Set Contents are = " + s1);

		System.out.println("Contains key = " + hm1.containsKey(0));
		System.out.println("Contains key = " + hm1.containsKey(6));
		System.out.println("Contains value = " + hm1.containsValue("A"));

		Iterator i1 = s1.iterator();

		while (i1.hasNext()) {

			Map.Entry mE1 = (Entry) i1.next();

			System.out.println("Contents, Key = " + mE1.getKey() + " and value = " + mE1.getValue());
		}

		System.out.println("\nNow getting values from key");

		String thirdValue = (String) hm1.get(3);
		System.out.println("thirdValue = " + thirdValue);

		System.out.println("Removing some values");
		hm1.remove(3);

		System.out.println("Now Size = " + hm1.size());

		System.out.println(hm1);

		System.out.println("Now thirdValue = " + (String) hm1.get(3));

		for (int i = 1; i <= hm1.size(); i++) {
			System.out.println("HM Values = " + hm1.get(i));
		}

		System.out.println("Checking all contents of HM post deleting an element.");

		Set s2 = hm1.entrySet();
		Iterator i2 = s2.iterator();
		while (i2.hasNext()) {
			Map.Entry mE2 = (Entry) i2.next();
			System.out.println("New contents, Key = " + mE2.getKey() + " and Value = " + mE2.getValue());
		}

		HashMap<String, String> hm2 = new HashMap<String, String>();
		hm2.put("first", "Ek");
		hm2.put(new String("second"), "Be");
		hm2.put("third", "Tran");
		hm2.put("fourth", "Char");

		Set s3 = hm2.entrySet();

		Iterator i3 = s3.iterator();

		System.out.println("hm2 = " + hm2);

		System.out.println("another value = " + hm2.get("first"));

		while (i3.hasNext()) {

			Map.Entry mE3 = (Entry) i3.next();

			System.out.println("Contents, Key = " + mE3.getKey() + " and value = " + mE3.getValue());
		}

	}

}

package com.rts.Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapClass {

	public static void main(String[] args) {

		LinkedHashMap lhm1 = new LinkedHashMap();

		lhm1.put(0, "");
		lhm1.put(1, null);
		lhm1.put(2, "A");
		lhm1.put(3, "M");
		lhm1.put(4, "B");
		lhm1.put(5, "A");

		System.out.println("Contents are = " + lhm1);

		System.out.println("Value - " + lhm1.get(0));

		if (lhm1.get(0) == null)
			System.out.println(" \"null\"");
		else
			System.out.println(" \"not null\"");

		if (lhm1.get(1) == null)
			System.out.println("null");
		else
			System.out.println("not null");

		System.out.println(lhm1.size());

		System.out.println(lhm1.isEmpty());

	}

}

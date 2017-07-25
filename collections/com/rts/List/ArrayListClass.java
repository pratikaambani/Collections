package com.rts.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ArrayListClass {

	public static void main(String[] args) {

		ArrayList al1 = new ArrayList();
		
		
		BlockingQueue b = new ArrayBlockingQueue(5);
		
		PriorityQueue pq = new PriorityQueue<>();
		pq.
		
		

		System.out.println("Size = " + al1.size());

		al1.add("P");
		System.out.println("Size = " + al1.size());

		al1.add("R");
		al1.add("A");
		al1.add("T");
		al1.add("I");
		al1.add("K");
		al1.add("A");

		System.out.println("Index Of A = " + al1.indexOf("A"));
		System.out.println("Last index Of A = " + al1.lastIndexOf("A"));

		System.out.println("Three ways to iterate through ArrayList.");
		System.out.println(al1);

		System.out.println("First");
		for (int a = 0; a < al1.size(); a++) {
			System.out.print(al1.get(a));
		}

		ArrayList<String> al2 = (ArrayList) al1.clone();

		al2.add("A");
		al2.add("M");
		al2.add("B");
		al2.add("A");
		al2.add("N");
		al2.add("I");

		System.out.println("\n \n");
		System.out.println(al2);
		System.out.println(al2.indexOf("T"));

		System.out.println("Before Sorting");

		System.out.println("Second.");
		for (String ele : al2) {
			System.out.println("ele = " + ele);
		}

		System.out.println("\n \n");
		for (int a = 0; a < al2.size(); a++) {
			System.out.print(al2.get(a));
		}

		System.out.println("\n \n");
		System.out.println("After sorting - Ascending");
		Collections.sort(al2);
		System.out.println(al2);

		System.out.println("\n \n");
		System.out.println("After sorting - Descending");
		Collections.sort(al2, Collections.reverseOrder());
		System.out.println(al2);

		al2.addAll(al1);

		System.out.println("Third.");
		ArrayList al3 = (ArrayList) al1.clone();

		System.out.println("al3 = " + al3);

		Iterator it = al3.iterator();

		System.out.println("\n \n");
		while (it.hasNext()) {
			System.out.println("Contents of Third Iterator = " + it.next());
		}

		System.out.println("\n \n");
		System.out.println(al2);
		System.out.println(al2.remove(5));
		System.out.println("\n \n");
		System.out.println(al2);
		System.out.println(al2.remove("A"));
		System.out.println("\n \n");
		System.out.println(al2);
		System.out.println(al2.remove("A"));
		System.out.println("\n \n");
		System.out.println(al2);

		System.out.println("This is al3");

		List<String> al4 = al2.subList(4, 10);

		System.out.println("\n \n");
		System.out.println("Sublist = " + al4);
		System.out.println("Cintains = " + al4.contains("R"));

		ArrayList al5 = new ArrayList<>(4);
		al5.add("R");
		al5.add("E");
		al5.add("L");
		al5.add("I");
		al5.add("A");

		System.out.println("\n \n");
		System.out.println(al5);
		System.out.println(al5.size());

		ArrayList al6 = new ArrayList<>(4);
		al6.add(32);
		al6.add(100);
		al6.add(99);
		al6.add(101);
		al6.add(99);

		System.out.println("\n \n");
		System.out.println("Index Of 99 = " + al6.indexOf(99));
		System.out.println("Last index Of 99 = " + al6.lastIndexOf(99));

	}
}

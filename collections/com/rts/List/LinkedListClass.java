package com.rts.List;

import java.util.Iterator;
import java.util.LinkedList;



public class LinkedListClass {

	public static void main(String[] args) {

		LinkedList ll1 = new LinkedList<>();

		ll1.add("A");
		ll1.add("M");
		ll1.add("B");
		ll1.add("A");
		ll1.add("N");
		ll1.add("I");
		System.out.println("Contents after adding are =" + ll1);

		ll1.addFirst("A");
		ll1.addLast("Z");

		for (int a = 0; a < ll1.size(); a++) {
			System.out.print(ll1.get(a));
		}
		System.out.println();

		System.out.println("Contents after adding are =" + ll1);

		ll1.removeFirst();
		ll1.removeLast();
		System.out.println("Contents after removing are =" + ll1);

		Object o = ll1.poll();
		System.out.println("Contents after polling are =" + ll1);

		System.out.println("o = " + o);

		System.out.println("Contents by using iterator");
		Iterator e = ll1.iterator();
		while (e.hasNext()) {
			System.out.println(e.next());
		}

		System.out.println("Descending order");

		e = ll1.descendingIterator();

		while (e.hasNext()) {
			System.out.println(e.next());
		}

		System.out.println("ll1 now is = " + ll1);
		ll1.push("Hi");
		System.out.println("ll1 now is = " + ll1);
		ll1.pop();
		System.out.println("ll1 now is = " + ll1);

		System.out.println("ll1 now is = " + ll1.peekLast());

	}

}

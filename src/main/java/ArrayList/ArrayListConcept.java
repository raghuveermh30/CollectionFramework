package ArrayList;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		// It is a default class in java
		// It behaves like a dynamic array
		// It will maintain the Indexing on order

		/*
		 * 3 ways of declaring arraylist 1. Default Generics - ArrayList is a raw type.
		 * -- I can add any type of data
		 */

		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(100); // 0
		ar.add("String param"); // 1
		ar.add(12.33); // 2
		ar.add(true); // 3

		System.out.println(ar);

		System.out.println(ar.get(2));

		System.out.println(ar.get(3));

		System.out.println(ar.size());

		System.out.println("Lowest Index" + 0);
		System.out.println("Highest Index" + (ar.size() - 1));

		ar.add(300);
		ar.add(400);
		System.out.println(ar.size());

	}

}

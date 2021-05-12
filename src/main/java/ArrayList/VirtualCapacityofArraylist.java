package ArrayList;

import java.util.ArrayList;

public class VirtualCapacityofArraylist {

	public static void main(String[] args) {

		ArrayList<Object> ar = new ArrayList<Object>();

		/*
		 * There are two types of capacity 1. Phyisical Capacity - PC value will be 0
		 * until we assign some thing 2. Virtual Capacity = By default the value will be
		 * 10 in VC
		 * 
		 * ArrayList<Object> ar = new ArrayList<Object>(20); Here we are declraring the
		 * capactiy so by Default the VC will be 20 (from 0-19)
		 * 
		 * If we want to check the VC run it in Debug mode..we will get to know of this
		 * concept
		 */

		ar.add(100);
		System.out.println(ar.size());
		ar.add(200);
		System.out.println(ar.size());

		ar.add(300);
		ar.add("Test");
		ar.add(500);
		System.out.println(ar.size());

	}

}

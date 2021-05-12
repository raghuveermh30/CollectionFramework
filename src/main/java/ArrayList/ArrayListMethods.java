package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;	
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("java");
		ar.add("python");
		ar.add("ruby");
		ar.add("Javascript");
		
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Testing");
		ar1.add("devops");
		
		//addAll() - combining the two array list
		
/*	ar.addAll(ar1);
		
		System.out.println(ar);
		
		ar.addAll(2, ar1);
		System.out.println(ar);
		
		ar.clear();
		
		System.out.println(ar);*/
		
		ArrayList<String> cloneList = (ArrayList<String>)ar.clone();
		System.out.println(cloneList);
		
		//contains
		
		
		System.out.println("***********Contains Functionality********");
		System.out.println(ar.contains("python"));
		System.out.println(ar.contains("c#"));
		
		
		
		System.out.println(ar.indexOf("ruby"));
		System.out.println(ar.indexOf("ruby")>0);
		
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("Naveen", "Tom", "Naveen", "Steve", "Lisa","Naveen"));
		System.out.println(list);
		System.out.println(list.lastIndexOf("Naveen"));
		System.out.println(list.lastIndexOf("Tom"));
		
		System.out.println("***********Contains Functionality********");
		
		ArrayList<String> test = new ArrayList<String>(Arrays.asList("Raghu", "Veer", "Fit"));
		System.out.println(test);
		
		//remove
		
		list.remove(2);
		System.out.println(list);
		
		list.add(2, "Naveen");
		System.out.println(list);
		
		list.remove("Naveen");
		System.out.println(list);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,89,0));
		
		//numbers.removeIf(num -> num%2 ==0); //removing even numbers
		numbers.removeIf(num -> num%2 !=0); // removing odd numvers
		System.out.println(numbers);
		
		//retain all method
		
		ArrayList<String> listName = new ArrayList<String>(Arrays.asList("Naveen", "Tom", "Peter", "Steve", "Lisa", "Tom"));
		System.out.println(listName);
		
		listName.retainAll(Collections.singleton("Tom"));
		
		System.out.println(listName);
		
		ArrayList<Integer> numbers1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,89,0,10,11,12,12,13,14));
		
		ArrayList<Integer> sublist = new ArrayList<Integer>(numbers1.subList(2, 6));
		System.out.println(sublist);
		
		//converting an Array List to an Array (single dimension array)
		
		ArrayList<String> newList = new ArrayList<String>(Arrays.asList("Naveen", "Tom", "Peter", "Steve", "Lisa", "Robert"));
		Object obj[] = newList.toArray();
		System.out.println(Arrays.toString(obj));
		
		System.out.println("******");
		
		for(Object o : obj) {
			System.out.println(o.toString());
		}
		
		ArrayList<Integer> ali = new ArrayList<Integer>(Arrays.asList(1,4,3,2,4,6,2,5,2,5,3));
		ali.removeIf(al1 -> al1%2!=0);
		System.out.println(ali);
		
		Object obj1[] = ali.toArray();
		System.out.println(Arrays.toString(obj1));
		
		for(int i =0;i<obj1.length;i++) {
			System.out.println(obj1[i]);
		}

	}

}

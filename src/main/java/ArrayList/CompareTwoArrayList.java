package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareTwoArrayList {

	public static void main(String[] args) {

		// 1. sort and then equals

		ArrayList<String> ar = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));

		ArrayList<String> ar1 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));

		ArrayList<String> ar2 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));

		Collections.sort(ar);
		Collections.sort(ar1);
		Collections.sort(ar2);
		System.out.println(ar.equals(ar1)); // false
		System.out.println(ar.equals(ar2)); // true

		// 2. compare Two list - find out additional elements:

		ArrayList<String> ar3 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));

		ArrayList<String> ar4 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
		
		//ar3.removeAll(ar4);
		
		System.out.println(ar3); // F

		//3. Findput the missing element
		
		ar4.removeAll(ar3);
		
		System.err.println("After Removal : "+ar4);
		
		//4. Findout the common elements are avail in 2 array list
		
		ArrayList<String> lang1 = new ArrayList<String>(Arrays.asList("Java", "Python", "Ruby", "C#", "JS"));

		ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("Java", "Python", "Ruby", "C#", "PHP"));
		
		lang1.retainAll(lang2);
		
		System.out.println("Retained elements : " +lang1);
		
	}

}

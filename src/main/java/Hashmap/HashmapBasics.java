package Hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashmapBasics {

	public static void main(String[] args) {
		/*
		Hashmap doesn't maintain any order and indexing also
		It stores the data in the form  of K and V
		It cannot contain duplicate values (Key cannot be duplicate)
		If Key has duplicate it wont thorw any error instaed it will give the latest value
		Can store N number of Null values but only only One Null Key, Internally it will give the latest Key value
		Hashmap is not Thread Safe but HashTable is Thread safe - Unsynchronised
			
		*/
		
		HashMap<String, String> capitalMap = new HashMap<String, String>();
		capitalMap.put("India", "Delhi");
		capitalMap.put("USA", "WashingtonDC");
		capitalMap.put("UK", "London");
		//capitalMap.put("UK", "London1");
		capitalMap.put(null, "Berlin");
		capitalMap.put(null, "LA");
		capitalMap.put("Russia", null);
		capitalMap.put("France", null);
		
		//Remove method
		capitalMap.remove("France");
			
		System.out.println(capitalMap.get("USA"));
		System.out.println(capitalMap.get("China"));
		System.out.println(capitalMap.get("UK"));
		System.out.println(capitalMap.get(null));
		System.out.println(capitalMap.get("France"));
		
		//Iterator over the keys : by using keySet()
		Iterator<String> it =capitalMap.keySet().iterator();
		while(it.hasNext()) {
		String key = it.next();
		String value = capitalMap.get(key);
		System.out.println("Key = " +key + " Value : " +value);
		}
		
		System.out.println("*****************");
		//Iterator over the set (Pair) : by using entrySet
		
		Iterator<Entry<String,String>> it1 = capitalMap.entrySet().iterator();
		
		while(it1.hasNext()) {
		Entry<String, String> entry =it1.next();
		System.out.println("Key = "+ entry.getKey()+ " Value = " +entry.getValue());
		}
		
		System.out.println("*****************");
		
		//Iterate Hashmap using Java 8 for each and lambda
		capitalMap.forEach((K,V) -> System.out.println("Key = " +K +" value = "+V));
		
		
		
	}

}

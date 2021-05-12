package Hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapCompare {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(1, "A");
		map2.put(2, "B");
		map2.put(3, "C");
		
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(3, "D");
		
		//1. comparision on the basis of Key-Value using equals Methos
		System.out.println(map1.equals(map2)); //True
		System.out.println(map1.equals(map3));//False
		
		System.out.println("*********");
		//2. compare hashmap for the same Keys using KeySet() method
		
		System.out.println(map1.keySet().equals(map2.keySet())); //True
		System.out.println(map1.keySet().equals(map3.keySet()));//True - because it will remove duplicate value hence 3 will be removed


		System.out.println("*************");
		
		//3. Find out the Extra key from Hashmap -- imp
		HashMap<Integer, String> map4 = new HashMap<Integer, String>();
		map4.put(1, "A");
		map4.put(2, "B");
		map4.put(3, "C");
		map4.put(4, "D");
		
		//combine/union the keys from both the Maps: using HashSet :
		HashSet<Integer> combineKeys = new HashSet<Integer>(map1.keySet());
		//add the KeySet from map4 also
		combineKeys.addAll(map4.keySet());
		combineKeys.removeAll(map1.keySet());
		System.out.println(combineKeys);
		
		//4. compare map by values
		HashMap<Integer, String> map5 = new HashMap<Integer, String>();
		map5.put(1, "A");
		map5.put(2, "B");
		map5.put(3, "C");
		
		HashMap<Integer, String> map6 = new HashMap<Integer, String>();
		map6.put(1, "A");
		map6.put(2, "B");
		map6.put(3, "C");
		
		HashMap<Integer, String> map7 = new HashMap<Integer, String>();
		map7.put(1, "A");
		map7.put(2, "B");
		map7.put(3, "C");
		map7.put(3, "C");
		
		//1. Duplicates are not allowed : using ArrayList
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values()))); //True
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values()))); //False
		
		System.out.println("*********");
		//2. Duplicated are allowed : Using HashSet
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values()))); //True
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map7.values()))); //True

	}

}

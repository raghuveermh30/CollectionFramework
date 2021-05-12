package Hashmap;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.management.ImmutableDescriptor;

public class HashMapInitialisation {
	
	public static Map<String, Integer> marksMap;
	
	static {
		marksMap = new HashMap<>();
		marksMap.put("A", 100);
		marksMap.put("B", 200);
	}

	public static void main(String[] args) {
		
		//1. using Hashmap class
		HashMap<String, String> map1 = new HashMap<>();
		Map<String, String> map2 = new HashMap<>();
		
		//2. static way : static Hashmap
		System.out.println(HashMapInitialisation.marksMap.get("A"));
		
		//3. Immutable Map with only one Single Entry
		Map<String, Integer> map3 = Collections.singletonMap("Test", 100);
		System.out.println(map3.get("Test"));
		//map3.put("ABC", 200); //java.lang.UnsupportedOperationException
		
		//4. JDK 8 :
		//Creating 2D array of Strings using Stream and collecting in the form of Map
		Map<String, String> map4 = Stream.of(new String[][] {
			{"Tom", "A Grade"},
			{"Peter", "B Grade"},
			}).collect(Collectors.toMap(data -> data[0], data -> data[1]));
		
		System.out.println(map4.get("Tom"));
		map4.put("Lisa", "A++ grade");
		System.out.println(map4.get("Lisa"));
		
		//5. Using SimpleEntry :
	Map<String, String> map5 =	Stream.of(
				new AbstractMap.SimpleEntry<String, String>("Tom", "Java"),
				new AbstractMap.SimpleEntry<String, String>("Peter", "Python"),
				new AbstractMap.SimpleEntry<String, String>("Robby", "C#")
				).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		System.out.println(map5.get("Tom"));
		map5.put("Lisa", "Selenium");
		System.out.println(map5.get("Lisa"));
		
		//6 JDK 1.9
		// Crearitng an empty map
		//Map<String, String> map6 = Map.of();
		
		//Singleton Map
		/*Map<String, String> singleTonMap = Map.of("K1","V1");
		System.out.println(singleTonMap.get("K1"));*/
		//singleTonMap.put("K2", "V2") //UnsupportedOperationException
		
		//Multi Values Map: max 10 pairs can be stored
	/*	Map<String, String> MultiMap = Map.of("K1","V1", "K2", "V2", "K3", "V3");
		System.out.println(singleTonMap.get("K3")) //V3 --o/p
		*/
		
		//ofEntries Method : no Limitations on Pairs (Key - Value)
		//Immutable map - i cannot add the values and i cannot chnage the values 
	/*	Map<String, String> map7 = Map.ofEntries(
				new AbstractMap.SimpleEntry<>("Tom", 100),
				new AbstractMap.SimpleEntry<>("Peter", 200)
				);
		
		System.out.println(map7.get("Tom")); //100
		map7.put("LISA", 300)// UnsupportedOperationException -- Immutable
				*/
		
		
	}

}

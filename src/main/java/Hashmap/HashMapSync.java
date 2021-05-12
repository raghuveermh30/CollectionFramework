package Hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSync {

	public static void main(String[] args) {
		
		// SynchronizedMap method in collection class
		Map<String, String> map1 = new HashMap<>();
		map1.put("1", "Tom");
		map1.put("2", "Peter");
		map1.put("3", "Steve");

		// Create Synchronized MAp	
		Map<String, String> syncMap= Collections.synchronizedMap(map1);
		System.out.println(syncMap.get("1"));
		
		//Concurrent Hashmap : It doesn't throw any ConcurrentModificationException
		
		ConcurrentHashMap<String, String> concurrentMap = new ConcurrentHashMap<>();
		concurrentMap.put("1", "Java");
		concurrentMap.put("2", "Selenuim");
		concurrentMap.put("3", "C#");
		System.out.println(concurrentMap.get("1"));
			
		
	}

}

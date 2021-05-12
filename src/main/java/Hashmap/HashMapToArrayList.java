package Hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapToArrayList {

	public static void main(String[] args) {

		HashMap<String, Integer> compMap = new HashMap<>();
		compMap.put("Google", 10000);
		compMap.put("Wallmart", 20000);
		compMap.put("GooglePay", 30000);
		compMap.put("Amazon", 40000);
		compMap.put("Facebook", 15000);

		System.out.println("Comp map size : " + compMap.size());

		Iterator it = compMap.entrySet().iterator();

		while (it.hasNext()) {
			Entry<String, Integer> entry = (Entry<String, Integer>) it.next();
			System.out.println("Key = " + entry.getKey() + " Value = " + entry.getValue());
		}
		
		System.out.println("************");

		// convert Hashmap Keys into Array list
		List<String> compNameList = new ArrayList<String>(compMap.keySet());
		System.out.println(compNameList);
		System.out.println(compNameList.size());
		for (String t : compNameList) {
			System.out.println(t);
		}
		System.out.println("************");

		// convert Hashmap Values into Array list
		List<Integer> employeeList = new ArrayList<Integer>(compMap.values());
		System.out.println(employeeList);
		System.out.println(employeeList.size());
		for (Integer t : employeeList) {
			System.out.println(t);
		}

	}

}

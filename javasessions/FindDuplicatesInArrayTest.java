package javasessions;

import java.util.*;
import java.util.Map.*;

public class FindDuplicatesInArrayTest {

    public static void main(String[] args) {

        String arr[] = {"Amazon", "Azure", "Amazon", "SauceLabs"};

        //1, Brut Force
        //2. Set
        //3. Hashmap<K,V>
        //4. Streams we can do

        //1
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    System.out.println("Duplicates are in tha array " + arr[i]);
                }
            }
        }

        //2
        Set<String> store = new HashSet<String>();
        for (String tech : arr) {
            if (store.add(tech) == false) {
                System.out.println("Duplictaes are in the array " + tech);
            }
        }

        //3 Hasmap
        System.out.println("********HashMap************");
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String e : arr) {
            Integer count = map.get(e);
            if (count == null) {
                map.put(e, 1);
            } else {
                map.put(e, ++count);
            }
        }

        Set<Entry<String, Integer>> entrySet = map.entrySet();

        for (Entry<String, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicates are in the string" + entry.getKey());
            }
        }

        System.out.println("********Using Streams*************");


    }
}

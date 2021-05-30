package starbasedpgms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DuplicateCharactersInString {

    public static void main(String[] args) {

        String inputString = "Naveen";
        checkDupChars(inputString);

    }

    public static void checkDupChars(String str){
        if(str==null){
            System.out.println("Null String");
            return;
        }
        if(str.isEmpty()) System.out.println("Empty String");

        if(str.length()==1){
            System.out.println("The Input string length is 1");
            return;
        }
            char[] charsArray= str.toCharArray();
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        for(Character ch : charsArray){
            if(charMap.containsKey(ch)){
                charMap.put(ch, charMap.get(ch)+1);
            }
            else {
                charMap.put(ch, 1);
            }
        }

      Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
        for(Map.Entry<Character, Integer> entry : entrySet){
            if(entry.getValue()>1){
                System.out.println(entry.getKey() + " " +entry.getValue());
            }
        }
    }
}

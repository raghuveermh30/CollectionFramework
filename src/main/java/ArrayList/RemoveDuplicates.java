package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<String> duplicateList = new ArrayList<String>();

        duplicateList.add("Java");
        duplicateList.add("Selenuim");
        duplicateList.add("BDD");
        duplicateList.add("Cucumber");
        duplicateList.add("Java");
      

        ArrayList<String> nonDupList = new ArrayList<String>();

        Iterator<String> dupIter = duplicateList.iterator();
        while (dupIter.hasNext()) {
            String dupWord = dupIter.next();
            if (nonDupList.contains(dupWord)) {
                dupIter.remove();
            } else {
                nonDupList.add(dupWord);
            }
        }
        System.out.println(nonDupList);
        
       
    }
    
  

}

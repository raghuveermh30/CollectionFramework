package ArrayList;

import java.util.ArrayList;

public class ArrayListIteration {

	public static void main(String[] args) {
	
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("Tom");
		strList.add("Peter");
		strList.add("QC");
		strList.add("wohoo");
		
		//Typical For Loop
		for(int i =0;i<strList.size();i++) {
			System.out.println(strList.get(i));
		}
		
		System.out.println("*********");
		
		//for each
		for(String s : strList) {
			System.out.println(s);
		}
		
		// java streams with Lambda Function after JDK 8
		System.out.println("*********");
		strList.stream().forEach(ele -> System.out.println(ele));			
	}

}

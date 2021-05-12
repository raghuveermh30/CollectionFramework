package ArrayList;

import java.util.ArrayList;

public class GenericsInArrayList {

	public static void main(String[] args) {
		
		//Arraylist will store only object type of data not primitive data. If we want to use primitive then we want to use wrapper class
		
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		marksList.add(100);
		marksList.add(200);
		
		ArrayList<Double> doubleList = new ArrayList<Double>();
		doubleList.add(12.33);
		doubleList.add(12.00);
		doubleList.add(100.00);
		
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("Test");
		stringList.add("123");
		

	}

}

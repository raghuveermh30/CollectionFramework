package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,1,2,3,12,3,4,2,3,4,2,23,4,42,2,1,233,4,2));
		
		//1. using LinkedHashSet
		
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbers);	
		ArrayList<Integer> numbersListWithoutDup = new ArrayList<Integer>(linkedHashSet);
		System.out.println(numbersListWithoutDup);
		System.out.println("***********");
		
		//2. JDK 8 Streams
		
		ArrayList<Integer> marksList = new ArrayList<Integer>(Arrays.asList(1,2,1,2,3,12,3,4,2,3,4,2,23,4,42,2,1,233,4,2));
		List<Integer> li = marksList.stream().distinct().collect(Collectors.toList());
		System.out.println(li);
		
	}

}

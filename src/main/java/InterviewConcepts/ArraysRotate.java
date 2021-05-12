package InterviewConcepts;

import java.util.*;

public class ArraysRotate {

	public static void main(String[] args) {
		
		 int arr[] = {1,2,3,4,5,6};
	        int temp;

	        for(int i = arr.length-2; i>=0;i--){
	            temp = arr[i];
	            arr[i] = arr[i+1];
	            arr[i+1] = temp;
	        }

	        System.out.println(Arrays.toString(arr));
	        
	        List<Integer> al = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
	        Collections.rotate(al, 1);
	        System.out.println(al);
	}

}

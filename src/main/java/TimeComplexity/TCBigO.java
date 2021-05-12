package TimeComplexity;

import java.util.HashMap;
import java.util.Map;

public class TCBigO {

	public static void main(String[] args) {
		
		int n=1; //O(1)
		System.out.println(n);
		
		//Odd/Even number  -- O(1) -- Primitive/Non primitive Data type it will be O(1)
		int num = 20; //O(1)
		if(num%2==0){
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		
		//Hashmap and fetch the value from look up table -- O(1)	
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Tom",100 );
		map.put("Peter",200 );
		map.put("Steve",300 );
		
		System.out.println(map.get("Peter")); // O(1)
		
		//O(n)
		//1 - 100 or 1000 or 10000 or 100000
		int n1 =10;
		for(int i =1 ;i<=n1;i++) {
			System.out.println(i);
		}
		//1 is const + 3n (i<=n, i++, syso)
		
		//1+n +n+n ==> 1+3n ==> 3n ==> n ==> O(n)
		

		//WAP to find a largest number in an array
		
		int arr[] = {2,34,5,6, 98, 100, 3, 4, 67};
		int max = 0; //1 -once
		for(int i=0; i<arr.length;i++) { //n
			if(max<arr[i]) {
				max = arr[i];
			}	
		}
		
		System.out.println(max); //1
		
		// 1+n+1 ==> 2+n ==> n ==> O(n)
		
		// Liner equation : n+1 or 2n+1 or 3n+1 or n 
	/*	
		O(n^2)
		n^2+2n+1
		2n^2+2n+3
		
		00 01 02 03 -- we need to print these values
		10 11 12 13
		20 21 22 23
		
		*/
		
		for(int m =0 ;m<=3 ; m++) { // 1 + m +m = 1+2m ==m  times it got executed
			for(int p = 0; p<=3;p++) { //1+2p == p p number of times it got executed 
				System.out.print(m+""+p+" ");
			}
			System.out.println();
		}
		
		//(1+2m)(1+3m) ==> 1+3m+2m+6m^2 ==> 1+5m+6m^2 ==> 5m+6m^2 ==> m^2+m (Removing the all const) == m^2 
		
		// O(n^2) == the time complexity of 2 for loops ==> 4*4 = 16 = 4^2
		
		//O(n^2) == Quadratic Equation
		
		System.out.println("******************");
		
		// WAP to get the duplicate number in the array
		
		int dup[] = {2,2,3, 4, 5,5, 7,7, 10, 12, 13, 15, 17, 19, 4, 7};
		
		for(int i=0; i<dup.length;i++) { //n 
			for(int j=0;j<dup.length;j++) { // n+n = 2n
				if(i==j) {
					continue;
				}
				if(dup[i] ==  dup[j]) {
					System.out.println(dup[i] + " is duplicated");
				}
			}
		}
		
		//n*2n = n^2
		
	
		for(int i =0;i<dup.length;i++) { //n
			for(int j=0;j<dup.length;j++) { //n
				for(int k =0;k<dup.length;k++) { // n	
					
				}
			}
		}
		
		//n*n*n = n^3
		
	}

}

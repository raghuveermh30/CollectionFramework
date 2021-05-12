package InterviewConcepts;

public class SumOddNumbers {

	public static void main(String[] args) {


	int start = 1;
	int end = 100;
	int sum =0;
	for(int i = start;i<=end;i++){
	
		if(i%2!=0) {
		//	System.out.println(i);
			sum = sum+i;
		
		}
	
	}
	System.out.println(sum);

	}

}

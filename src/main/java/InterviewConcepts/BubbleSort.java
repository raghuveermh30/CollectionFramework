package InterviewConcepts;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int arr[] = {4,5,6,72,3,5,6};

	        int size = arr.length;
	        int temp;

	        for(int i = 0; i<size-1;i++){
	            for(int j = 0 ;j<size-i-1;j++){
	                if(arr[j]>arr[j+1]){
	                  temp = arr[j];
	                  arr[j]= arr[j+1];
	                  arr[j+1] = temp;
	                }
	            }
	        }

	        for(int i = 0 ;i<size;i++){
	            System.out.println(arr[i]+" ");
	        }
	    }


	}



package javasessions;

import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int arr[], int element, int low, int high){

        while (low<=high){
            int mid =  low + (high-low)/2;

            //check the element is present in mid
            if(arr[mid]==element){
                return mid;
            }

            if(arr[mid]<element){
                low = mid+1;
            }

            else {
                high= mid-1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 6, 7, 8, 9 };
        int n = arr.length;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element needs to be searched");
        int element = sc.nextInt();
        sc.close();

     int result=   binarySearch(arr, n, 0, n-1);

     if(result==-1){
         System.out.println("Not Found");
     }
     else{
         System.out.println("The element is present at the index "+result);
     }
    }
}

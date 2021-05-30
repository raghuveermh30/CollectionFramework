package javasessions;

import java.util.Arrays;

public class SecondLargest {

    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};

        int size = arr.length;

        if(size<2){
            System.out.println("Invalid Input");
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // Start from second last element as the largest element is at last
        for (int i = size - 2; i >= 0; i--)
        {
            // If the element is not equal to largest element
            if (arr[i] != arr[size - 1])
            {
                System.out.printf("The second largest element is " + arr[i]);
                return;
            }
        }
        System.out.printf("There is no second largest element");
    }


}

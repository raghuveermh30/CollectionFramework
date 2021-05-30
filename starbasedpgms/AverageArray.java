package starbasedpgms;

import com.google.common.math.DoubleMath;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AverageArray {

    public static void main(String[] args) {

        int arr[] = {1,2,3,5,6,78,43,46,4,3};
        int sum = 0;

        for(int i =0; i<arr.length;i++){
            sum = sum+arr[i];
        }
        System.out.println("Sum is : "+sum);
        System.out.println("Average is : " +sum/arr.length);

        // Use Streams
       OptionalDouble optionalDouble =  Arrays.stream(arr).average();
        System.out.println("Average is : "+ optionalDouble.getAsDouble());

        // Google Guva Lib

      double avg =   DoubleMath.mean(arr);
        System.out.println("Average is : "+avg);

    }
}

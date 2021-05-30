package javasessions;

import java.util.Arrays;

public class PerfectSquare {

    public static void main(String[] args) {
        perfectSquareNumbers(1,100);
       }

       public static void perfectSquareNumbers(int start, int end){
        for(int i = start; i<=end;i++){

            if(Math.sqrt(i)==(int)Math.sqrt(i)){
                System.out.println(i + " ");
            }
        }
       }
}

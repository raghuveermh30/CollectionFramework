package InterviewConcepts;

import java.util.Scanner;

public class LeapYesr {
    public static void main(String[] args) {

        // divisible by 4 for all the Century years = 00

        //Centuray year is Leap year only when it is divisble by 400
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year");
        int year = sc.nextInt();
        boolean leap = false;

        if(year%4 ==0){
            if(year%100==0){
                if(year%400 ==0){
                    leap= true;
                }
                else{
                    leap=false;
                }
            }
            else {
                leap= true;
            }
        }
        else{
            leap = false;
        }

        if(leap){
            System.out.println(year+ " is a leap year");
        }
        else
        {
            System.out.println(year+ " is not a leap year");
        }
    }
}

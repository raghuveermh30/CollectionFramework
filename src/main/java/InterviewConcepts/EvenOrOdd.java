package InterviewConcepts;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Number");
        int i = sc.nextInt();

        if(i%2==0){
            System.out.println("The Entered Number is Even ");
        }
        else {
            System.out.println("The Entered Number is Odd");
        }

    }
}

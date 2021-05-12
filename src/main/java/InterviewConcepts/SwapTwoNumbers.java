package InterviewConcepts;

public class SwapTwoNumbers {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Before Swapping ");
        System.out.println("The value of a " +a);
        System.out.println("The value of b " +b);

        //By using Temp var

        int temp;
        temp = a;
        a = b;
        b= temp;

        System.out.println("After Swapping ");
        System.out.println("The value of a " +a);
        System.out.println("The value of b " +b);

        // With Out Using Temp Var

        System.out.println("Before Swapping ");
        System.out.println("The value of a " +a);
        System.out.println("The value of b " +b);

        a=a-b;
        b=a+b;
        a=b-a;

        System.out.println("After Swapping ");
        System.out.println("The value of a " +a);
        System.out.println("The value of b " +b);

    }
}

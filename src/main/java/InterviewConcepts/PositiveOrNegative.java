package InterviewConcepts;

public class PositiveOrNegative {

    public static void main(String[] args) {

        double num = 1233;

        if (num < 0.0) {
            System.out.println("The Entered Number is Negative number" +num);
        } else if (num > 0.0) {
            System.out.println("The Entred Number is a Positive Num" +num);
        }
        else{
            System.out.println("The Number is Zero" +num) ;
        }
    }
}

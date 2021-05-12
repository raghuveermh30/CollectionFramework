package InterviewConcepts;

public class NaturalNumSumWithRecurssion {

    public static void main(String[] args) {

        // A method it called itself

        int num = 20;

       int sum = addNum(num);
        System.out.println("Sum of the Integres " +sum);
    }

    public static int addNum(int n){
        if(n!=0){
            return n + addNum(n-1);
        }

        else{
            return n;
        }
    }
}

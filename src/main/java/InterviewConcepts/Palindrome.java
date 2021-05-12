package InterviewConcepts;

public class Palindrome {

    public static void main(String[] args) {
        int num = 121;
        int rev = 0;
        int actualNum = num;
       while (num!=0){
            int n = num%10;
            rev= rev*10 + n;
            num=num/10;
        }
        System.out.println(rev);

       if(actualNum==rev){
           System.out.println("The " +actualNum+ " is Palindrome");
       }
       else {
           System.out.println("The " +actualNum+ " is not a Palindrome");
       }
       
       
    }
}

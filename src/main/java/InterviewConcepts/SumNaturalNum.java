package InterviewConcepts;


public class SumNaturalNum {

    public static void main(String[] args) {

        int num = 100;
        int sum = 0;
        int sum1 =0 ;

        for(int i=1;i<=num;i++){
            sum = sum+i;
        }
        System.out.println("Sum of Natuaral Num "+sum);

        System.out.println("**********");

      int k=1;
      while (k<=num){
          sum1= sum1+k;
          k++;
      }
        System.out.println("Sum of Natuaral Num "+sum);

    }
}

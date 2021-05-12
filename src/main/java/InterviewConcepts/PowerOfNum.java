package InterviewConcepts;

public class PowerOfNum {

    public static void main(String[] args) {

        int base = 2;
        int exp=9;
        long result = 1;
        while (exp!=0){
            result = result*base;
            --exp;
        }
        System.out.println(result);

       double res= Math.pow(2,9);
        System.out.println(res);
    }
}

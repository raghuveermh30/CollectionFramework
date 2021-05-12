package InterviewConcepts;

public class CheckPrimeNumber {

    //Java Program to check weahter the number can be expressed with sum of 2 Prime Number
    //34 -- 3+31, 5+29, 17+17
    public static void main(String[] args) {

       // System.out.println(checkPrimeNum(17));
        int num = 34;
        boolean flag = false;

        for(int i =2;i<=num/2;i++){
            if(checkPrimeNum(i)){
                if(checkPrimeNum(num-i)){
                    System.out.println(num + " = "+i+"+" +(num-i));
                    flag = true;
                }
            }
        }

        if(!flag){
            System.out.println(num + "Cannot be Expressed as the Sum of 2 Prime Numbers");
        }

    }

    public static boolean checkPrimeNum(int n){
        boolean flag = true;
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                flag = false;
                break;
            }

        }
        return  flag;
    }
}

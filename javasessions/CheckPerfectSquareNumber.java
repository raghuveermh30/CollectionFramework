package javasessions;

public class CheckPerfectSquareNumber {

    public static void main(String[] args) {

       int n = 25;

       if(isPerfectSquareNum(n)){
           System.out.println("The entered number is perfect square");
       }
       else{
           System.out.println("The entered number is not perfect square");
       }

        if(perfectSquare(n)){
            System.out.println("The entered number is perfect square");
        }
        else{
            System.out.println("The entered number is not perfect square");
        }
    }


    public static boolean isPerfectSquareNum(int n){

        for(int i = 1; i*i<=n;i++){

            if((n%i==0) && (n/i==i)){
                return true;
            }

        }

        return false;
    }

    public static boolean perfectSquare(int num){

        long left = 1, right = num;

        while (left<=right){
            long mid = (left+right)/2;

            //check if mid is Square
            if(mid*mid==num){
                return  true;
            }

            if (mid*mid<num){
                left = mid+1;
            }

            else{
                right = mid-1;
            }

        }

    return false;
    }
}

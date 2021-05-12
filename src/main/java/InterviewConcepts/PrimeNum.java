package InterviewConcepts;

public class PrimeNum {

    public static void main(String[] args) {

        int num = 13;
        boolean flag = false;

        for(int i =2;i<=num/2;i++){
            if(num%i==0){
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("Number " +num+ "is a Prime num");
        }
        else{
            System.out.println("Number " +num+ "is not a Prime num");
        }

        System.out.println("Prime Number in a Particular Range");

        //Need prime num between 10-20
        int low = 10;
        int high = 20;

        while (low<high){
            boolean flag1 = false;
            for(int i = 2; i<low/2;i++){
                if(low%i==0){
                    flag1=true;
                    break;
                }
            }
            if(!flag1){
                System.out.println(low + " ");
            }
            low++;
        }


    }
}

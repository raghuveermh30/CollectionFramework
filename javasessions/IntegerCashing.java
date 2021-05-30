package javasessions;

public class IntegerCashing {

    public static void main(String[] args) {

        /*
        Comparing the Two Integers (Integer Cashing)

        The Integer cashing will happen with in the range that is -128 to 127
        */

        Integer num1 = 100;
        Integer num2 = 100;
        if(num1==num2){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Numbers are not equal");
        }

        Integer num3 = 200;
        Integer num4 = 200;
        if(num3==num4){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Numbers are not equal"); //This will come as o/p
        }

    }
}

package javasessions;

public class DoubleMinValue {

    public static void main(String[] args) {

      /*  What is the value of Double MIN_Value ?
                Which one is the bigger ->Double Min_Value or 0.0d ?
                Which is the bigger -> Double Min_Value or Negative_Infinity ?


*/
        int i=10;
        i=20;
        System.out.println(i);

        System.out.println(Double.MIN_VALUE); // is a +ve num
        System.out.println(Long.MIN_VALUE);// is a -ve num
        System.out.println(Integer.MIN_VALUE);// is a -ve num
        System.out.println(Float.MIN_VALUE); // is a +ve num

        System.out.println("***********");

        System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
        System.out.println(Math.min(Integer.MIN_VALUE, 0.0d));
        System.out.println(Math.min(Float.MIN_VALUE, 0.0d));

        System.out.println("***********");

        System.out.println(Math.min(Double.MIN_VALUE, Double.NEGATIVE_INFINITY));// This is the Lowest Number
    }
}

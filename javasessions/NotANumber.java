package javasessions;


import java.awt.geom.FlatteningPathIterator;

public class NotANumber {

  /*  What is a NAN?
    How is NAN defined in diff lang?
    Java, C, C++, Ruby, Python, Javascript

*/
    public static void main(String[] args) {

        System.out.println(0.0/0);
        System.out.println(2.0/0.0);
        System.out.println(Math.sqrt(-1));

        System.out.println(Float.NaN == Float.NaN); //In this case Compiler will give FALSE
        System.out.println(Float.NaN != Float.NaN);  //In this case Compiler will give TRUE



        //NAN is not defined in C

//        NAN is Not a Number which will come when we divide the floating number with the 0


    }
}

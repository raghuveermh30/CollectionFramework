package javasessions;

public class PrintOneToHundred {

    public static void main(String[] args) {

       /* Print the numbers from the Code without using Numbers in the Prog*/

        int one = 'A'/'A' ; //1
        String s1 = "..........";

        for(int i = one ;i <= (s1.length()*s1.length());i++){
            System.out.println(i);
        }

        //a=97  b=98  c=99 d=100

        for(int i = one; i<='d';i++){
            System.out.println(i);
        }
    }
}

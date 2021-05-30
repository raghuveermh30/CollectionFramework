package starbasedpgms;

public class AlphabetPattern2 {

    public static void main(String[] args) {

       /* A
        B B
        C C C
        D D D D
        E E E E E*/

       int alpha = 65;
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) alpha + " ");
            }
            alpha++;
            System.out.println();
        }

    }
}

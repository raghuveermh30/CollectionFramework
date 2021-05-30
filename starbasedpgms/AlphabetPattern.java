package starbasedpgms;

public class AlphabetPattern {

    public static void main(String[] args) {

    /*  A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        */
    int alpha = 65;
    for(int i =0;i<=5;i++){
        for(int j=0;j<=i;j++){
            System.out.print((char)(alpha+j) + " ");
        }
        System.out.println();
    }

        for(int i =0;i<=5;i++){
            for(int j =4;j>=i;j--){
                System.out.print(" ");//spaces
            }
            for(int k=0;k<=i;k++){
                System.out.print((char)(alpha+k) + " ");
            }
            System.out.println();
        }


    }
}

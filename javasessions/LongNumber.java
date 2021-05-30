package javasessions;

public class LongNumber {

    public static void main(String[] args) {

        long longNumWithoutL = 1000*60*60*24*365;
        long longNumWithL = 1000*60*60*24*365L;

        System.out.println(longNumWithoutL); //1471228928
        System.out.println(longNumWithL); //31536000000

        //11101010111101100010010110000000000 - 36 bits

       //1010111101100010010110000000000 - 32 bits //1471228928 //This will remove the 4 most significant bits
    }
}

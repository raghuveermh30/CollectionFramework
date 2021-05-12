package InterviewConcepts;

public class LargestNum {

    public static void main(String[] args) {

        int x = 100;
        int y = 200;
        int z = 300;

        if (x >= y && x >= z) {
            System.out.println("X is the greatest");
        } else if (y >= z) {
            System.out.println("Y is the greatest");
        } else {
            System.out.println("Z is the greatest");
        }

        if (x >= y) {
            if (x >= z) {
                System.out.println("X is the greatest");
            } else {
                System.out.println("Z is the greatest");
            }
        } else {
            if (y >= z) {
                System.out.println("Y is the greatest");
            } else {
                System.out.println("Z is the greatest");
            }
        }
    }
}

package javasessions;

public class PrintNumbersfrom1to100 {
    static int i = 1;

    public static void main(String[] args) {
        printNo(100);

        if (i <= 100) {
            System.out.printf("%d ", i++);
            main(null);
        }
    }

    static void printNo(int n) {
        if (n > 0) {
            printNo(n - 1);
            System.out.print(n + " ");
        }
    }
}

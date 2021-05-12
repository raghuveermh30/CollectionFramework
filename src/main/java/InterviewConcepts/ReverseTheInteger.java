package InterviewConcepts;

import java.util.Scanner;

public class ReverseTheInteger {

	public static void main(String[] args) {

		System.out.println("Enter the Integer");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// long num = 12345;
		long rev = 0;

		// Using proper algorithm
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		System.out.println("Reverse number is :" + rev);

		// Using String Buffer

		// 12System.out.println(new StringBuffer(String.valueOf(num)).reverse());
	}

}
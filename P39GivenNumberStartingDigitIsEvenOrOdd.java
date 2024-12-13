package programming_numbers;

import java.util.Scanner;

public class P39GivenNumberStartingDigitIsEvenOrOdd {
	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		int n = new Scanner(System.in).nextInt();
		int digCnt = countDigits(n);
		int p = pow(10, digCnt - 1);
		int fir_dig = n / p;
		if (fir_dig % 2 == 0) {
			System.out.println(fir_dig > 0 ? "+ Even Digit" : "- Even Digit");
		} else {
			System.out.println(fir_dig > 0 ? "+ Odd Digit" : "- Odd Digit");
		}
	}

	public static int countDigits(int n) {
		int c = 0;
		while (n != 0) {
			c++;
			n /= 10;
		}
		return c;
	}

	public static int pow(int b, int e) {
		int p = 1;
		for (int i = 1; i <= e; i++) {
			p *= b;
		}
		return p;
	}
}

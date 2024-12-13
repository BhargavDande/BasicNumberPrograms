package programming_numbers;

import java.util.Scanner;

public class P40MaximumDigitInGivennumber {
	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		long n = new Scanner(System.in).nextLong();
		long maxVal = 0;
		while (n != 0) {
			long rem = n % 10;
			maxVal = maxVal > rem ? maxVal : rem;
			n /= 10;
		}
		System.out.println("Maximum digit is : " + maxVal);
	}
}

package programming_numbers;

import java.util.Scanner;

public class P41MinimumDigitInGivenNumber {
	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		long n = new Scanner(System.in).nextLong();
		long minVal = 9;
		while (n > 0) {
			long rem = n % 10;
			minVal = minVal < rem ? minVal : rem;
			n /= 10;
		}
		System.out.println("Minimum digit is : " + minVal);
	}
}

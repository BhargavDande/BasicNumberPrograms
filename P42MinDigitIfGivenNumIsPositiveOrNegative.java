package programming_numbers;

import java.util.Scanner;

public class P42MinDigitIfGivenNumIsPositiveOrNegative {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number : ");
		long n = ip.nextLong();
		if (n < 0) {
			long maxVal = 0;
			n = -1 * n;
			while (n != 0) {
				long rem = n % 10;
				maxVal = maxVal > rem ? maxVal : rem;
				n /= 10;
			}
			System.out.println("Minimum digit is : " + -(maxVal));
		} else {
			long minVal = 9;
			while (n > 0) {
				long rem = n % 10;
				minVal = minVal < rem ? minVal : rem;
				n /= 10;
			}
			System.out.println("Minimum digit is : " + minVal);
		}

	}
}

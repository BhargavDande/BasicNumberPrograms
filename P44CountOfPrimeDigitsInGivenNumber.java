package programming_numbers;

import java.util.Scanner;

public class P44CountOfPrimeDigitsInGivenNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = ip.nextInt();
		int primeCount = 0;
		while (n != 0) {
			int rem = n % 10;
			if (rem == 2 || rem == 3 || rem == 5 || rem == 7)
				primeCount++;
			n /= 10;
		}
		System.out.println("Prime digits count is : " + primeCount);
	}
}

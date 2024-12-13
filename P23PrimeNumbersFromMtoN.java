package programming_numbers;

import java.util.Scanner;

public class P23PrimeNumbersFromMtoN {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter m value : ");
		int m = ip.nextInt();
		System.out.println("Enter n value : ");
		int n = ip.nextInt();
		for (int i = m; i <= n; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static boolean isPrime(int n) {
		int c = 0;
		for (int i = 1; i <= n; i++)
			if (n % i == 0)
				c++;
		return c == 2;
	}

}

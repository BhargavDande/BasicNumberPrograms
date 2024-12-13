package programming_numbers;

import java.util.Scanner;

public class P30NprimeNumbersFromStarting {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter n value, for how many prime Numbers : ");
		int n = ip.nextInt();
		primeNums(n);
	}

	public static void primeNums(int n) {
		for (int i = 2; n > 0; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
				n--;
			}
		}
	}

	public static boolean isPrime(int n) {
		int c = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				c++;
		}
		return c == 2;
	}
}

package programming_numbers;

import java.util.Scanner;

public class P22PrimeNumberOrNot {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = ip.nextInt();
		System.out.println(isPrime(n) ? "Prime Number" : "Not a Prime Number");
	}

	public static boolean isPrime(int n) {
		int c = 0;
		for (int i = 2; i <= n / 2; i++)
			if (n % i == 0)
				c++;
		return c == 0;
	}
}

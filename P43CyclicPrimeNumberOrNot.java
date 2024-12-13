/*Write a Java program to check whether a given number is a Cyclic Prime Number or not. 
 * A Cyclic Prime is a prime number that remains prime when its digits are cyclically rotated.

Example:
->For example, 197 is a cyclic prime because:
->197 is a prime number.
->When its digits are cyclically rotated, we get 971 and 719, both of which are also prime numbers.
->Note: A cyclic prime must remain prime for every possible rotation of its digits.*/

package programming_numbers;

import java.util.Scanner;

public class P43CyclicPrimeNumberOrNot {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = ip.nextInt();
		int cd = countDigits(n);
		int p = (int) Math.pow(10, cd - 1);

		while (cd > 0) {
			if (isPrime(n)) {
				int fd = n / p;
				int rds = n % p;
				n = rds * 10 + fd;
			} else {
				break;
			}
			cd--;
		}
		if (cd == 0 && n != 0)
			System.out.println(n + " is cyclic prime number..");
		else
			System.out.println(n + " is not cyclic..");
	}

	public static boolean isPrime(int n) {
		int c = 0;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				c++;
			}
		}
		return c == 0;
	}

	public static int countDigits(int n) {
		int c = 0;
		while (n != 0) {
			c++;
			n /= 10;
		}
		return c;
	}
}

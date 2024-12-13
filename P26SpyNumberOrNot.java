/*Write a Java program to check whether a given number is a Spy Number or not.
 *  A Spy Number is a number where the sum of its digits is equal to the product of its digits.

Problem Definition:
A number is a Spy Number if the sum of its digits is equal to the product of its digits.
For example, for the number 1124, the sum of digits is 1 + 1 + 2 + 4 = 8 and the product of digits is 1 * 1 * 2 * 4 = 8.
 Since the sum and product are the same, 1124 is a Spy Number.*/

package programming_numbers;

import java.util.Scanner;

public class P26SpyNumberOrNot {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = ip.nextInt();
		System.out.println(sumDigits(n) == productOfDigits(n) ? "Spy NUmber" : "Not a Spy NUmber");
	}

	public static int sumDigits(int n) {
		int sum = 0;
		while (n != 0) {
			int last_digit = n % 10;
			n = n / 10;
			sum += last_digit;
		}
		return sum;
	}

	public static int productOfDigits(int n) {
		int prod = 1;
		while (n != 0) {
			int last_digit = n % 10;
			n = n / 10;
			prod *= last_digit;
		}
		return prod;
	}
}

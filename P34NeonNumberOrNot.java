/*Write a Java program to check whether a given number is a Neon Number or not. 
 * A Neon Number is a number where the sum of the digits of the square of the number is equal to the number itself.

For example:
->9 is a Neon Number because:
->The square of 9 is 81, and the sum of the digits of 81 is 8 + 1 = 9, which is equal to the original number.*/

package programming_numbers;

import java.util.Scanner;

public class P34NeonNumberOrNot {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = ip.nextInt();
		int sq = n * n;
		int sumOfDig = sumOfDigits(sq);
		System.out.println(n == sumOfDig ? "Neon Number " : "Not a Neon Number");
	}

	public static int sumOfDigits(int n) {
		int sum = 0;
		while (n != 0) {
			int last_digit = n % 10;
			sum += last_digit;
			n = n / 10;
		}
		return sum;
	}
}

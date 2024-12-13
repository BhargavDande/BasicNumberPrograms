/* Write a Java program to check if a given number is a Strong Number or not. 
 * A Strong Number (also called a Krishna Number) is a number 
 * where the sum of the factorials of its digits is equal to the number itself.

For example:

145 is a Strong Number because:
1! + 4! + 5! = 1 + 24 + 120 = 145.*/

package programming_numbers;

import java.util.Scanner;

public class P27StrongNumberOrNot {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = ip.nextInt();
		int temp = n;
		int sum_of_fact = 0;
		while (n != 0) {
			sum_of_fact += factorial(n % 10);
			n = n / 10;
		}
		System.out.println(temp == sum_of_fact ? "Strong Number" : "Not aStrong Number");
	}

	public static int factorial(int n) {
		int fact = 1;
		for (int i = 2; i <= n; i++)
			fact *= i;
		return fact;
	}
}

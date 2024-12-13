/*Write a Java program to check whether a given number is a Perfect Square Number or not.
 *  A Perfect Square is a number that is the square of an integer. 
 *  In other words, a number n is a perfect square if there exists an integer m such that m * m = n.

For example:
->16 is a Perfect Square because 4 * 4 = 16.
->25 is a Perfect Square because 5 * 5 = 25.
->20 is not a Perfect Square because no integer m satisfies m * m = 20.*/

package programming_numbers;

import java.util.Scanner;

public class P35PerfectSquareOrNot {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = ip.nextInt();
		for (int i = 1; i * i <= n; i++) {
			if (i * i == n) {
				System.out.println(n + " is perfect square");
				return;
			}
		}
		System.out.println(n + " is not a perfect square");
	}
}

/*Write a Java program to determine whether a given number is a Xylem number or a Phloem number.
 * A number is xylem if the sum of extreme digits is equal to the sum of all middle digits.
 Explanation :
 -> 34326 is xylem , because :
 -> Extreme digits : 3+6 = 9 is equal to inner digits 4+3+2 = 9*/

package programming_numbers;

import java.util.Scanner;

public class P45XylemOrPholem {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = ip.nextInt();
		int temp = n;
		int eds = 0;
		int rds = 0;
		eds = eds + (n % 10);
		n = n / 10;
		int cd = countDigits(n);
		int p = (int) Math.pow(10, cd - 1);
		eds = eds + (n / p);
		n = n % p;
		for (int i = 1; n > 0; i++) {
			int rem = n % 10;
			rds += rem;
			n /= 10;
		}
		if (eds == rds)
			System.out.println(temp + " is Xylem..");
		else
			System.out.println(temp + " is Pholem..");
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

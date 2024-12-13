/*Write a Java program to check whether a given number is an Armstrong Number or not. 
 * An Armstrong Number (also known as a Narcissistic Number) 
 * is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

For example:
->153 is an Armstrong Number because:
->1^3 + 5^3 + 3^3 = 153 (Here, 153 has 3 digits, and we raise each digit to the power of 3).
->370 is also an Armstrong Number because:
->3^3 + 7^3 + 0^3 = 370 (Again, 370 has 3 digits).*/

package programming_numbers;

import java.util.Scanner;

public class P36ArmStrongNumberOrNot {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = ip.nextInt();
		int countOfDig = countOfDigits(n);
		System.out.println(isArmStrongNum(n, countOfDig) ? "ArmStrong Number" : "Not a ArmStrong Number");
	}

	public static boolean isArmStrongNum(int n, int countOfDig) {
		int sum = 0;
		int temp = n;
		while (n != 0) {
			int last_dig = n % 10;
			sum += pow(last_dig, countOfDig);
			n = n / 10;
		}
		return temp == sum;
	}

	public static int countOfDigits(int n) {
		int c = 0;
		while (n != 0) {
			n = n / 10;
			c++;
		}
		return c;
	}

	public static int pow(int n, int e) {
		int pow = 1;
		for (int i = 1; i <= e; i++) {
			pow *= n;
		}
		return pow;
	}
}

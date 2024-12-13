/*Write a Java program to check whether a given number is a Palindrome Number or not. 
 * A Palindrome Number is a number that reads the same backward as forward.

For example:
->121 is a Palindrome Number because if you reverse it, you get 121.
->123 is not a Palindrome Number because reversing it gives 321, which is not the same as the original number.*/

package programming_numbers;

import java.util.Scanner;

public class P32PalindromeOrNot {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = ip.nextInt();
		System.out.println(isPalindrome(n) ? "Palindrome Number" : "Not a palindrome");
	}

	public static boolean isPalindrome(int n) {
		int temp = n;
		int rev = 0;
		while (n != 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		return rev == temp;
	}
}

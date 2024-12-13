/*Write a Java program to convert a given decimal number to its octal equivalent.
 Example 1:
 Input: 10
 Output: "12"
 Explanation: The octal representation of 10 is 12.*/

package programming_numbers;

import java.util.Scanner;

public class P51ConvertDecimalToOctal {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a Decimal number : ");
		int n = ip.nextInt();
		String upNum = "";
		while (n != 0) {
			int rem = n % 8;
			upNum = rem + upNum;
			n /= 8;
		}
		System.out.println("Octal value : " + upNum);
	}
}

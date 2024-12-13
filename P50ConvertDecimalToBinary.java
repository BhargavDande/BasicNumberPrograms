/*Write a Java program that converts a given decimal number to its binary equivalent.
 *Example 1:
  Input: 10
  Output: "1010"
  Explanation: The binary representation of 10 is 1010. */

package programming_numbers;

import java.util.Scanner;

public class P50ConvertDecimalToBinary {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a Decimal number : ");
		int n = ip.nextInt();
		String upNum = "";
		while (n != 0) {
			int rem = n % 2;
			upNum = rem + upNum;
			n /= 2;
		}
		System.out.println("Binary value : " + upNum);
	}
}

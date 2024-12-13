/*Write a Java program to check whether a given number is an autobiographical number or not.
 An autobiographical number is a number in which each digit tells the number of times that digit appears in the number.
  For example:
  -> 1210 is an autobiographical number because : 
  -> 0's are 1
  -> 1's are 2
  -> 2's are 1
  -> 3's are 0 . */

package programming_numbers;

import java.util.Scanner;

public class P46AutoBioGraphicalNumberOrNot {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = ip.nextInt();
		int cd = countDigits(n);
		int upNum = 0;
		for (int i = 0; i < cd; i++) {
			upNum = upNum * 10 + countParticularNum(n, i); // units place we are adding digits
		}
		System.out.println(upNum == n ? "Autobiographical Number.." : "Not a Autobiographical Number..");
	}

	public static int countParticularNum(int n, int i) {
		int c = 0;
		while (n != 0) {
			int rem = n % 10;
			if (rem == i)
				c++;
			n /= 10;
		}
		return c;
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

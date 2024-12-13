// Write a java program to print Kth digit from last side for the given Number.
// [ input = 98456 , k = 4 , output = 8 ]

package programming_numbers;

import java.util.Scanner;

public class P54PrintKthDigitFromLastSideForGivenNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = ip.nextInt();
		System.out.println("Enter kth value : ");
		int k = ip.nextInt();
		int temp = k;
		int cd = countDigits(n);

		if (k > cd || k < 0) {
			System.out.println("Invalid kth value..");
		} else {
			while (k > 1) {
				n /= 10;
				k--;
			}
			System.out.println(temp + " digit from last is : " + n % 10);
		}
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

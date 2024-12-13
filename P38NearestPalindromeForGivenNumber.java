package programming_numbers;

import java.util.Scanner;

public class P38NearestPalindromeForGivenNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a value : ");
		int n = ip.nextInt();
		int upPalin;
		int downPalin;
		for (int i = n + 1;; i++) {
			if (isPalindrome(i)) {
				upPalin = i;
				break;
			}
		}
		for (int j = n - 1;; j--) {
			if (isPalindrome(j)) {
				downPalin = j;
				break;
			}
		}
		if (upPalin - n == n - downPalin) {
			System.out.print(downPalin + " " + upPalin);
		} else if (upPalin - n < n - downPalin) {
			System.out.println(upPalin);
		} else {
			System.out.println(downPalin);
		}
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

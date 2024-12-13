package programming_numbers;

import java.util.Scanner;

public class P33NpalindromeNumbersFromStartingValue {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter n val for how many nums we want : ");
		int n = ip.nextInt();
		System.out.println("Enter starting value");
		int start = ip.nextInt();
		for (int i = start; n > 0; i++) {
			if (isPalindrome(i)) {
				System.out.print(i + " ");
				n--;
			}
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

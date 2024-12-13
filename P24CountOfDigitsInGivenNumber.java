package programming_numbers;

import java.util.Scanner;

public class P24CountOfDigitsInGivenNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = ip.nextInt();
		System.out.println(n + " Digits count is : " + countOfDigits(n));
	}

	public static int countOfDigits(int n) {
		int count = 0;
		while (n != 0) {
			n = n / 10;
			count++;
		}
		return count;
	}
}

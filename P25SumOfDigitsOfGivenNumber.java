package programming_numbers;

import java.util.Scanner;

public class P25SumOfDigitsOfGivenNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = ip.nextInt();
		System.out.println(n + " sum of digits is : " + sumOfDigits(n));
	}

	public static int sumOfDigits(int n) {
		int sum = 0;
		while (n != 0) {
			int last_digit = n % 10;
			sum += last_digit;
			n = n / 10;
		}
		return sum;
	}
}

package programming_numbers;

import java.util.Scanner;

public class P18DivisibleBy3and5 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = ip.nextInt();
		divisibleBy5And3(n);
	}

	public static void divisibleBy5And3(int n) {
		if (n % 5 == 0 && n % 3 == 0)
			System.out.println(n + " is divisible by 3 and 5");
		else
			System.err.println(n + " is not divisible by 3 and 5");
	}
}

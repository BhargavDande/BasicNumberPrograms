package programming_numbers;

import java.util.Scanner;

public class P19DivisibleBy3and5fromMtoN {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number for m value : ");
		int m = ip.nextInt();
		System.out.println("Enter a number for n value : ");
		int n = ip.nextInt();
		divisibleBy5And3(m, n);
	}

	public static void divisibleBy5And3(int m, int n) {
		for (int i = m; i <= n; i++) {
			if (i % 5 == 0 && i % 3 == 0)
				System.out.println(i + " is divisible by 3 and 5");
		}
	}
}

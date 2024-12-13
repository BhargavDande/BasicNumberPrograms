package programming_numbers;

import java.util.Scanner;

public class P48NthFibonacciSeries {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter first series : ");
		int a = ip.nextInt();
		System.out.println("Enter second series : ");
		int b = ip.nextInt();
		System.out.println("Enter how many series : ");
		int s = ip.nextInt();
		for (int i = 1; i < s; i++) {
			int c = a + b;
			a = b;
			b = c;
		}
		if (s > 0)
			System.out.println("Nth series is : " + a);
		else
			System.err.println("Invalid Series : " + s);
	}
}

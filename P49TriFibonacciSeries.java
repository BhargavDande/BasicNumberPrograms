package programming_numbers;

import java.util.Scanner;

public class P49TriFibonacciSeries {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter first series : ");
		int a = ip.nextInt();
		System.out.println("Enter second series : ");
		int b = ip.nextInt();
		System.out.println("Enter third series : ");
		int c = ip.nextInt();
		System.out.println("Enter how many series : ");
		int s = ip.nextInt();
		for (int i = 1; i <= s; i++) {
			System.out.print(a + " ");
			int d = a + b + c;
			a = b;
			b = c;
			c = d;
		}
	}
}

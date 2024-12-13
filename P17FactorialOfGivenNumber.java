package programming_numbers;

import java.util.Scanner;

public class P17FactorialOfGivenNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number for factorial : ");
		int n = ip.nextInt();
		int res = factorial(n);
		System.out.println(res);
	}

	public static int factorial(int n) {
		int fact = 1;
		while (n > 1) {
			fact *= n;
			n--;
		}
		return fact;
	}
}

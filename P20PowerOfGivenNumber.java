package programming_numbers;

import java.util.Scanner;

public class P20PowerOfGivenNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter base value : ");
		int base = ip.nextInt();
		System.out.println("Enter exponent value : ");
		int exp = ip.nextInt();
		System.out.println(powOfNum(base, exp));
	}

	public static int powOfNum(int b, int e) {
		int pow = 1;
		for (int i = 1; i <= e; i++)
			pow *= b;
		return pow;
	}
}

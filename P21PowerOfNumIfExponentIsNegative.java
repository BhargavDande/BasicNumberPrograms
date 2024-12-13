package programming_numbers;

import java.util.Scanner;

public class P21PowerOfNumIfExponentIsNegative {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter Base value : ");
		int base = ip.nextInt();
		System.out.println("Enter Exponent value : ");
		int exp = ip.nextInt();
		if (exp >= 0)
			System.out.println(powOfNum(base, exp));
		else
			System.out.println(1.0 / powOfNum(base, -(exp)));
	}

	public static int powOfNum(int b, int e) {
		int pow = 1;
		for (int i = 1; i <= e; i++)
			pow *= b;
		return pow;
	}
}

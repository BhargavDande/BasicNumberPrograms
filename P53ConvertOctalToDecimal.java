package programming_numbers;

import java.util.Scanner;

public class P53ConvertOctalToDecimal {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter Octal value : ");
		int n = ip.nextInt();
		int res = 0;
		int exp = 0;
		while (n != 0) {
			int rem = n % 10;
			int p = (int) Math.pow(8, exp);
			res = res + (rem * p);
			exp++;
			n /= 10;
		}
		System.out.println("Decimal value is : " + res);
	}
}

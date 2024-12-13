package programming_numbers;

import java.util.Scanner;

public class P37ArmStrongNumbersFromMtoN {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter m value : ");
		int m = ip.nextInt();
		System.out.println("Enter n Value : ");
		int n = ip.nextInt();
		for (int i = m; i <= n; i++) {
			int countOfDig = countOfDigits(i);
			if (isArmStrongNum(i, countOfDig)) {
				System.out.println(i + " is ArmStrong Number");
			}
		}
	}

	public static boolean isArmStrongNum(int n, int countOfDig) {
		int sum = 0;
		int temp = n;
		while (n != 0) {
			int last_dig = n % 10;
			sum += pow(last_dig, countOfDig);
			n = n / 10;
		}
		return temp == sum;
	}

	public static int countOfDigits(int n) {
		int c = 0;
		while (n != 0) {
			n = n / 10;
			c++;
		}
		return c;
	}

	public static int pow(int n, int e) {
		int pow = 1;
		for (int i = 1; i <= e; i++) {
			pow *= n;
		}
		return pow;
	}
}

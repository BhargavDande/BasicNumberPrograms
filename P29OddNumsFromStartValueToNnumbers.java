package programming_numbers;

import java.util.Scanner;

public class P29OddNumsFromStartValueToNnumbers {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter n value for how many numbers we want : ");
		int n = ip.nextInt();
		System.out.println("Enter starting Value : ");
		int start = ip.nextInt();
		oddNums(n, start);
	}

	public static void oddNums(int n, int start) {
		for (int i = start; n > 0; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
				n--;
			}
		}
	}
}

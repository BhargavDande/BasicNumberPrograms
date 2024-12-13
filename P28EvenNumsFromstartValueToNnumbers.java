package programming_numbers;

import java.util.Scanner;

public class P28EvenNumsFromstartValueToNnumbers {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter how many even numbers : ");
		int n = ip.nextInt();
		System.out.println("Enter starting value : ");
		int start = ip.nextInt();
		evenNums(n, start);
	}

	public static void evenNums(int n, int start) {
		int c = 0;
		for (int i = start; i > 0; i++)
			if (c == n)
				break;
			else if (i % 2 == 0) {
				System.out.print(i + " ");
				c++;
			}
	}
}

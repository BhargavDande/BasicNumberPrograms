//Write a java program to print Zigzag order for the Given 2 Numbers.
// input :  n1 = 150 , n2 = 170 . output = 115700

package programming_numbers;

import java.util.Scanner;

public class P55ArrangeGiven2NumbersInZigzagOrder {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter 1st number : ");
		int n1 = ip.nextInt();
		System.out.println("enter 2nd number : ");
		int n2 = ip.nextInt();
		int cd1 = countDigits(n1);
		int cd2 = countDigits(n2);
		int p1 = (int) Math.pow(10, cd1 - 1);
		int p2 = (int) Math.pow(10, cd2 - 1);
		int res = 0;
		while (p1 > 0 || p2 > 0) {
			if (p1 > 0) {
				int fd = n1 / p1;
				res = res * 10 + fd;
				n1 = n1 % p1;
				p1 = p1 / 10;
			}
			if (p2 > 0) {
				int fd = n2 / p2;
				res = res * 10 + fd;
				n2 = n2 % p2;
				p2 = p2 / 10;
			}
		}
		System.out.println("Zigzag is : " + res);
	}

	public static int countDigits(int n) {
		int c = 0;
		while (n != 0) {
			c++;
			n /= 10;
		}
		return c;
	}
}

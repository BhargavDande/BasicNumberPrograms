package programming_numbers;

import java.util.Scanner;

public class P12LargestNumberOfThreeNums {
    public static void main(String[] args) {
    	Scanner ip = new Scanner(System.in);
		System.out.println("Enter 1st Number : ");
		int a = ip.nextInt();
		System.out.println("Enter 2nd Number : ");
		int b = ip.nextInt();
		System.out.println("Enter 3rd Number : ");
		int c = ip.nextInt();
		int res = a > b && a > c ? a : (b > c ? b : c);
		System.out.println("Largest Number is : " + res);
	}
}

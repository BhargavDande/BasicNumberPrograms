package programming_numbers;

import java.util.Scanner;

public class P13LargestNumberOfGiven4Numbers {
    public static void main(String[] args) {
    	Scanner ip = new Scanner(System.in);
		System.out.println("Enter 1st Number : ");
		int a = ip.nextInt();
		System.out.println("Enter 2nd Number : ");
		int b = ip.nextInt();
		System.out.println("Enter 3rd Number : ");
		int c = ip.nextInt();
		System.out.println("Enter 4th Number : ");
		int d = ip.nextInt() ;
		int res = a>b && a>c && a>d ? a :(b>c && b>d ? b : (c>d ? c : d));
		System.out.println("Largest Number of " +a+" , " +b+" , " +c+" , " +d+ " is : " +res);
	}
}

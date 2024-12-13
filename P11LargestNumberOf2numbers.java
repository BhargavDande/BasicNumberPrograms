package programming_numbers;

import java.util.Scanner;

public class P11LargestNumberOf2numbers {
    public static void main(String[] args) {
    	Scanner ip = new Scanner(System.in);
		System.out.println("Enter 1st Number : ");
		int a = ip.nextInt();
		System.out.println("Enter 2nd Number : ");
		int b = ip.nextInt();
		System.out.println(a > b ? "Largest Number is : " +a : "Largest Number is : "+b);
	}
}

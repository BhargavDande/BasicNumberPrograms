package programming_numbers;

import java.util.Scanner;

public class P16OddNumsFromMtoN {
    public static void main(String[] args) {
    	Scanner ip = new Scanner(System.in);
		System.out.println("Enter m value");
		int m = ip.nextInt();
		System.out.println("Enter n value");
		int n = ip.nextInt();
		for(int i = m; i <= n ; i++) {
			if(i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}
}

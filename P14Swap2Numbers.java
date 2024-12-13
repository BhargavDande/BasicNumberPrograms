package programming_numbers;

import java.util.Scanner;

public class P14Swap2Numbers {
    public static void main(String[] args) {
    	Scanner ip = new Scanner(System.in);
		System.out.println("Enter 'a' value : ");
		int a = ip.nextInt();
		System.out.println("Enter 'b' value : ");
		int b = ip.nextInt();
		System.out.println("Before swapping a : " + a + " , b : " +b);
		
		// Using temporary variable (or) 3rd variable
//		int temp = a;
//		a = b;
//		b = temp;
//		System.out.println("After swapping a : " + a + " , b : " +b);
		
		//Using Addition operator
//		a = a+b;
//		b = a-b;
//		a = a-b;
//		System.out.println("After swapping a : " + a + " , b : " +b);
		
		//By using Expression
		a = b-a+(b=a);
		System.out.println("After swapping a : " + a + " , b : " +b);
		
		//By Using XOR operator
//		a = a^b;
//		b = a^b;
//		a = a^b;
//		System.out.println("After swapping a : " + a + " , b : " +b);
	}
}

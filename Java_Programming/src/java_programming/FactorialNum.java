package java_programming;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a Num :");
//
//		int num = sc.nextInt();
//		long factorial = 1;
		// 5! = 1*2*3*4*5 =120 - Ascending Order
		/*
		 * for (int i = 1; i <= num; i++) { factorial = factorial * i;
		 * 
		 * } System.out.println(factorial);
		 * 
		 */

		// 5! = 5*4*3*2*1 =120 - descending order
		/*
		 * for (int i=num;i>=1;i--) { factorial = factorial * i;
		 * 
		 * } System.out.println(factorial);
		 * 
		 */
//		while (num > 1) {
//			factorial = factorial * num;
//			num--;
//		}
//		System.out.println(factorial);
//		
//		

		// Factorial for list

		int a[] = { 3, 4, 5, 6, 7, 8, 9 };

		int[] factorial = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			factorial[i] = factorial(a[i]);

		}
		System.out.println(Arrays.toString(factorial));
		
//		
//		for(int num:a) {
//			factorial=factorial(num);
//			System.out.println(num);
//		}
	}

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

}

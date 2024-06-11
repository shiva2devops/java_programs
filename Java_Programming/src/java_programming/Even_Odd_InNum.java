package java_programming;

import java.util.Scanner;

public class Even_Odd_InNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Num :");

		int num = sc.nextInt();
		// 12345
		int evencount = 0;
		int oddcount = 0;
		while (num > 0) {
			int rem = num % 10;

			if (rem % 2 == 0) {
				evencount++;

			} else if (rem % 2 != 0) {
				oddcount++;

			}
			num = num / 10;
			
		}
		System.out.println("Even digits count is :"+evencount);
		System.out.println("Odd digits count is :"+oddcount);

	}

}

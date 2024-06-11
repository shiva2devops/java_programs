package java_programming;

import java.util.Scanner;

public class CountNumOfDigitsInNUM {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Num :");
		
		int num=sc.nextInt();
		int Count=0;
		while(num!=0) {
			num=num/10;
			Count++;
		}
		System.out.println(Count);
		

	}

}

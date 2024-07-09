package java_programming;

import java.util.Scanner;

public class SumOfDigitsInNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Num :");
		
		int num=sc.nextInt();
		int sum=0;
		while(num>0) {
			sum=sum+num%10;
			num=num/10;
			
		}
		System.out.println("The sum of the digits are :"+sum);

	}

}


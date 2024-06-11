package java_programming;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number here for multiplication table :");
		int num=sc.nextInt();
		for(int i=1;i<=30;i++) {
			System.out.println(num+" X "+i+" = "+(num*i));
		}

	}

}

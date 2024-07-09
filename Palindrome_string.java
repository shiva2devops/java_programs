package java_programming;

import java.util.Scanner;

public class Palindrome_string {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String value :");
		
		String s=sc.next();
		String rev="";
		System.out.println(s.length());
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);

		if(s.equals(rev)) {
			System.out.println("Given string is palindrome");
		}else {
			System.out.println("Given string not is palindrome");
		}
	}
	

}

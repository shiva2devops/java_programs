package java_programming;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Num :");
		
		int num=sc.nextInt();
/*		
 *     // Using algorithm                         ,
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("After the reverse num is :"+rev);
*/
		// Using Stringbuffer
/*		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev= sb.reverse();
		System.out.println("After the reverse num is :"+rev);
		
*/		
		// Using Stringbuilder
		
		StringBuilder sbl=new StringBuilder();
		sbl.append(num);
		StringBuilder rev= sbl.reverse();
		System.out.println("After the reverse num is :"+rev);
		
		
		
		
	}

}

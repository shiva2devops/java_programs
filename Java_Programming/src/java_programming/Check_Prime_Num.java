package java_programming;

import java.util.Scanner;

// Natural Number > 1
// Which has only 2 factors 1 and itself

// 19 => 1 and 19 => Prime number
// 28 => 1,2,3,4,7,14,28 => Not a Prime number

public class Check_Prime_Num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num");

		int num = sc.nextInt();
		
		int count = 0;
//		String primenums=" ";
		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
			    }
			}
			if (count == 2) {
					System.out.println("Given num is prime number");
			} 
			else {
					System.out.println("Given num is not prime number");
				}

		} else {
			 System.out.println("The given num is not a prime number");
		}
		
//		for(int i=1;i<num;i++) {
//			if(num%i==0) {
//				System.out.println(i + " ");
//				count++;
//			}
//		}
//		System.out.println(count);
//		

	
/*	     int[] a= {1,2,3,4,2,3,4,11,23,10};
	     int count=0;
	     for(int i=0;i<a.length;i++) {
	    	 if(a[i]%1==0) {
	    		 count++;
	    	 }
	    	 
	    	 if(count==2) {
	    		 System.out.println("Given num is prime number");
				} 
				else {
						System.out.println("Given num is not prime number");
					}
	     }
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	

}

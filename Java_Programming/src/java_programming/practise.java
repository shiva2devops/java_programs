package java_programming;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class practise {

	
	
	public static void main(String[] args) {
		
		int[] a= {2,2,4,4,2,8,4};
		boolean status=true;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				
			}else {
				status=false;
			}
		}
		if(status) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		
		//Print prime nums in given array
		int[] b= {1,2,3,4,5,6,78,9};
		int countevens=0;
		for(int i=1;i<b.length;i++) {
			if(b[i]%i==0) {
				countevens++;
			}
			
		}
			if(countevens==2) {
				System.out.println("Given num is prime num"+countevens);
			}else{
				System.out.println("Given num is not prime num");
			}
			
		
		

		/*
		 * // input shiva123 , Output shiva 123 String s = "shiva123"; String alp = "";
		 * int nums = 0; char ch = 0; for (int i = 0; i < s.length(); i++) { ch =
		 * s.charAt(i); if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) { alp = alp +
		 * ch; }
		 * 
		 * } System.out.println(alp); System.out.println(ch);
		 */

		// Reverse string in middle/last word

		/*
		 * // Count String occureneces String str="abcdABCDabcd";
		 * 
		 * char arr[]=str.toCharArray(); HashMap<Character, Integer> map=new
		 * HashMap<Character, Integer>(); for(Character ch:arr) {
		 * if(map.containsKey(ch)) { map.put(ch, map.get(ch)+1); }else{ map.put(ch, 1);
		 * } } for(Character key:map.keySet()) {
		 * System.out.println(key+" "+map.get(key));
		 * 
		 * }
		 */
		// Second largest num in given array
		/*
		 * int a[]= {1,2,3,4,5,76,7}; int max=a[0]; int min=a[0]; for(int
		 * i=0;i<a.length;i++) { if(max<a[i]) { max=a[i]; }else if (min>a[i]) {
		 * min=a[i]; } } System.out.println(max); System.out.println(min);
		 */
		// Input 1111 output 1

/*		String str = "11111222234555";

		Set<Character> se = new HashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			se.add(ch);

		}
		System.out.println(se);

*/		
		// Reverse string last two chars
/*		String str="shivamaragoni";
		
		String s1=str.substring(0,str.length()-2);
		String s2=str.substring(str.length()-2, str.length());
		String rev="";
		System.out.println(s1+""+s2);
		for(int i=s2.length()-1;i>=0;i--) {
			rev=rev+s2.charAt(i);
		}
		System.out.println(s1+""+rev);
		

		 int count = 2; 
	 
	        for (int i = 1; i <= 10; i++) { 
	            System.out.println(count); 
	            count += 4; 
	           }
*/	        
	}

	private static void elseif(boolean b) {
		// TODO Auto-generated method stub
		
	}
}

package java_programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
/*		//Reverse String
		String s1="shiva";
		String rev="";
		
		for(int i=s1.length()-1;i>=0;i--) {
			rev=rev+s1.charAt(i);
		}
		System.out.println(rev);
		
		
		// fibonacci
		int a=0,b=1,sum=0;
		System.out.print(a+" "+b);
		for(int i=1;i<=10;i++) {
			sum=a+b;
			System.out.print(" "+sum);
			a=b;
			b=sum;
		}
		
		// find max number in array
		int d[]= {1,2,3,4,5,6,7,45,49};
		int max=d[0];
		for(int i=0;i<=d.length-1;i++) {
			if(d[i]>max) {
				max=d[i];
			}
		}
		System.out.println(max);
		
		
		// Check Prime number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num");
		int num=sc.nextInt();
		
		int count=0;
		if(num>1) {
			for(int i=1;i<10;i++) {
				if(num%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println("given num is prime");
			} else {
				System.out.println("given num is not prime");
			}
		}
		
		
		//Reverse given number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num");
		int num=sc.nextInt();
		
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
	
	
		// Count num of digits in num
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num");
		int num=sc.nextInt();
		int count=0;
		while(num!=0) {
			num=num/10;
			count++;
		}
		System.out.println(count);
	

		// remove last 2 digits of array
		int a[]= {1,2,3,4,5,6,7,8};
		
		int l=a.length-1;
		
		ArrayList<Integer> list=new ArrayList<>();
		for(int i:a) {
			list.add(i);
		}
		
		list.remove(l);
		
		list.remove(l-1);
		
		System.out.println(list);
		
		int newarr[] = new int[list.size()];
		
		for(int i=0;i<list.size();i++) {
			newarr[i]=list.get(i);
		}
		System.out.println(Arrays.toString(newarr));
		

*/
		// identify unique items from 2 lists and store it in 3 list
		List<String> list1=new ArrayList<>();
		list1.add("1");
		list1.add("2");
		list1.add("7");
		list1.add("4");
		list1.add("5");
		
		
		List<String> list2=new ArrayList<>();
		list2.add("1");
		list2.add("2");
		list2.add("7");
		list2.add("4");
		list2.add("9");
		
		List<String> unique=new ArrayList<>();
		
	
		System.out.println(unique);
		for(String item:list1) {
			if(!list2.contains(item)) {
				unique.add(item);
			}
		}
		for(String item:list2) {
			if(!list1.contains(item)) {
				unique.add(item);
			}
		}
		System.out.println(unique);
	
	
	
	
	
	
	
	
	
	
	}
	
	  
	

}

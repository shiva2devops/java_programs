package java_programming;

import java.util.Scanner;

public class Check_ArmStrong_Num {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num to check whether it is armstrong or not");
		int num=sc.nextInt();
		int a,sum = 0,temp;
		temp=num;
		while(temp>0) {
			a=temp%10;
			temp=temp/10;
			sum=sum+(a*a*a);
		}
		System.out.println(sum);
		
		if(num==sum) {
			System.out.println("The given num is an armstrong num: "+ "\n"+"Its match :"+num+" "+sum);
		}else {
			System.out.println("The given num is not an armstrong num:"+ "\n"+"does'nt match :"+num+" "+sum);
		}
		
		

	}

}

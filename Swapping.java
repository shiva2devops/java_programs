package java_programming;

public class Swapping {

	public static void main(String[] args) {

		
		int a=11,b=20;
		System.out.println("before swapping The values are "+a+" "+b);
		// using third variable
/*		int t=a;
		a=b;
		b=t;
		System.out.println("after swapping The values are "+a+" "+b);
*/
		// Using + & - 
/*		a=a+b;   // a= 31
		b=a-b;   // b=11
		a=a-b;   // a=31-11
		System.out.println("after swapping The values are "+a+" "+b);
*/
		// Using * & /
		a=a*b;  //a=220
		b=a/b;  //b=220/20=11
		a=a/b;  //a=220/11=20
		System.out.println("after swapping The values are "+a+" "+b);
		
		
		
	}

}

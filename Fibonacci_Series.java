package java_programming;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// 0,1,1,2,3,5,8,13
		int a=0,b=1,sum = 0;
		System.out.print(a+" "+b);
		for(int i=1;i<=10;i++) {
			sum=a+b;
			System.out.print(" "+sum);  //1,2,3,5,8
			a=b;  //1,1,2,2
			b=sum; //1,2,3,5
		}
		

	}

}

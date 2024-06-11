package java_programming;

public class LargestOf3Nums {

	public static void main(String[] args) {
		int a=10,b=60,c=90;
/*		if(a>b && a>c) {
			System.out.println("a is the largest num "+a);
		}else if(b>a && b>c) {
			System.out.println("b is the largest num "+b);
		}else if(c>a && c>b) {
			System.out.println("c is the largest num "+c);
		}
		*/
		
		
		// Using Ternary Operator
//		int largest=a>b?a:b;
		int largest_num=c>(a>b?a:b)?c:a>b?a:b;
		System.out.println(largest_num);
		

	}

}

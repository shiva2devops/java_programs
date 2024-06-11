package practise_sessions;

import java.sql.Array;

public class Arrays {

	public static void main(String[] args) {

//		Assignments
//		------------
//		1) Find Sum of Elements in Array
//		a={1,2,3,4,5}
//		Sum=15

/*		int a[] = { 1, 2, 3, 4, 5, 7 };
		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];

		}
		System.out.println("total sum value is :" + sum);
*/
//		Ref Video: https://www.youtube.com/watch?v=BDvYp3GbfU4
//
//		2) Print Even and Odd numbers  from array.
//		a={1,2,3,4,5,6}
//		Even= 3
//		Odd=3
		int b[] = { 1, 2, 3, 4, 5, 6,7 ,8,9,11};
		int Even = 0;
		int Odd = 0;
		System.out.println(b.length);
		
		// Second Method
		for(int x:b) {
			System.out.println(x);
			if(x%2==0) {
				Even++;
				
			}else if (x%2 !=0) {
				Odd++;
			}
		}
		System.out.println("EvenCount is :"+Even);
		System.out.println("OddCount is :"+Odd);
		
		// First Method
	/*	for (int e = 0; e < b.length; e++) {
			if (b[e] % 2 == 0) {
				System.out.println(b[e]);
				Even[e] = Even[e] + b[e];
	//			System.out.println("The Even nums are :" + Even);
				
			} else if (b[e] % 2 != 0) {
				Odd[e] = Odd[e] + b[e];
	//			System.out.println("The Odd nums are :" +Odd);
			}
		}
		System.out.println("The Even nums are :" + Even);
		System.out.println("The Odd nums are :" +Odd);

		*/
		
//		Ref Link: https://www.youtube.com/watch?v=e3x0bnOrcAA
//
//		3) Search an element in array
//		a={10,20,30,40,50}
//		num=30
//
//		4) Sorting elements
//		a={50,20,40,10,100}
//
//		after sorting 10 20 40 50 100
		

	}

}

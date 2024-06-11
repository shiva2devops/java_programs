package practise_sessions;

public class ConditionalStatements {

	public static void main(String[] args) {

		//Switch Case
		int week=1;
		
		switch (week) {
		case 1: 
			System.out.println("Sunday"); break;
		case 2:
			System.out.println("Monday"); break;

		default:
			System.out.println("weekday not found");
		}
		
//		 Assignment:1
//		1) largest of 2 numbers  ( if..else   & Ternary)
		
		int a=261, b=265;
		if(a>b) {
			System.out.println("a is the larget num :"+ a);
		}
		else {
			System.out.println("b is the largest num :"+ b);
		}
		
		int largenum=(a>b) ? a : b;
		System.out.println("The large num is :"+ largenum);
		

		
//       Assignment:2
//		2) smallest of 3 numbers  ( if..else)
//       Assignment:3
//		3) print month name by taking month number ( 1-12) using switch case..

		


	}

}

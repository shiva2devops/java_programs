package practise_sessions;

public class Loops {

	public static void main(String[] args) {
//		while loop
//		---------------
//		while(condition)
//		{
//		statements;
//		inc/dec;
//		}
//		int n = 10;
//		while (n <= 20) {
//			System.out.println(n);
//			n++;
//		}

//
//		do...while
//		----------------
//		do
//		{
//		statements;
//		inc/dec;
//		}while(condition);
//
//
//
//		for loop
//		----------
//		for(initilization; condition; inc/dec )
//		{
//		statements;
//		}
//	}

		// Reverse number

		int i = 1231342, temp;
		temp = i;

		int reverse_num = 0;

		while (i != 0) {
			int digit = i % 10; // 6
			reverse_num = reverse_num * 10 + digit; // 0+6
			i /= 10; // 12345
		}
		System.out.println(reverse_num);

		// Palindrome number

		if (temp == reverse_num) {
			System.out.println("Given num is palindrome");
		} else {
			System.out.println("Given num is not a palindrome");
		}

		// Count Number of Digits in a Number

	}

}

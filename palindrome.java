package java_programming;

public class palindrome {

	public static void main(String[] args) {
		int s=123456;
		int rev = 0;
		while(s!=0) {
			rev=rev*10+s%10;
			s=s/10;
		}
		System.out.println(rev);

		if(s==rev) {
			System.out.println("Given num is palindrome");
		}else {
			System.out.println("Given num not is palindrome");
			}
		
		
	}

}

package java_programming;

public class ReverseString {

	public static void main(String[] args) {

		// Using String Concatenation
		String s1 = "shiva";
		String rev = "";
		/*
		 * int len=s1.length(); //4
		 * 
		 * /* for (int i=len-1;i>=0;i--) { rev = rev+s1.charAt(i);
		 * 
		 * } System.out.println(rev);
		 */

		// Using Character array
		/*
		 * char a[]=s1.toCharArray(); int len=a.length;
		 * 
		 * for(int i=len-1;i>=0;i--) { rev=rev+a[i]; } System.out.println(rev);
		 */
		// Using StringBuffer
		StringBuffer st = new StringBuffer(s1);
		StringBuffer rev1 = st.reverse();
		System.out.println(rev1);


	}

}

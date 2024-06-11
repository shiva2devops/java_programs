package java_programming;

public class FindUpperLowerCaseInString {

	public static void main(String[] args) {
		String s="Welcome To Java Shiva";
		s=s.replaceAll("\\s","");
	
		int uppercount=0;
		int lowercount=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>=65 && ch<=90) {
				uppercount++;
			}else {
				lowercount++;
			}
		}
		System.out.println(uppercount);
		System.out.println(lowercount);

	}

}

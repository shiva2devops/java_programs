package java_programming;

public class DivideNumsAndAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="shiva1234";
		
		String alphabets="";
		String nums="";
		for(char ch:s.toCharArray()) {
			if(Character.isDigit(ch)) {
				nums += ch;
			}else if(Character.isLetter(ch)) {
				alphabets += ch;
			}
		}

		System.out.println("numbers :"+nums);
		System.out.println("Alphabets :"+alphabets);
	}

}

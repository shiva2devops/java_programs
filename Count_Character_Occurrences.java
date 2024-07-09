package java_programming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Count_Character_Occurrences {

	public static void main(String[] args) {
		String str = "I am learning java java programs";
		str = str.replaceAll("\\s", "");
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		Integer count = 1;
		char arr[] = str.toCharArray();
		/*
		 * for(int i=0;i<str.length();i++) { char ch=str.charAt(i);
		 * if(!map.containsKey(ch)) { map.put(ch, count); }else { map.put(ch,
		 * map.get(ch)+1); }
		 * 
		 * } for(Character x:map.keySet()) {
		 * System.out.println("The character occurrences are :"+x+" = "+map.get(x)); }
		 * 
		 * 
		 */
		// Using for each
		for (Character ch : arr) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, count);
			}

		}
		for (Character x : map.keySet()) {
			
			System.out.println(x + " is comes " + map.get(x) + " times");
			

		}

//		
//		Set<Map.Entry<Character, Integer>> entryset = map.entrySet();
//		for (Map.Entry<Character, Integer> entry : entryset) {
//			System.out.println(entry.getValue() + " " + entry.getKey());
//		}
	}

}

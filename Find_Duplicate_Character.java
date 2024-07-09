package java_programming;

import java.util.HashMap;

public class Find_Duplicate_Character {

	public static void main(String[] args) {
		String str="java shiva twa";
		str=str.replaceAll("\\s", "");
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		int count=1;
		char[] strArray=str.toCharArray();
		for(char c:strArray) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, count);
			}
		}
		
		for(Character key:map.keySet()) {
			if(map.get(key)>1) {
				System.out.println(key+" "+map.get(key));
			}
		}
		



	}

}

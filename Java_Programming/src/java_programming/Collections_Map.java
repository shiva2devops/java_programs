package java_programming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collections_Map {

	public static void main(String[] args) {
//		ArrayList list=new ArrayList();
		List ls=new ArrayList();
		ls.add(1);
		ls.add("shiva");
		ls.add(1);
		ls.add(1.3);
		ls.add("sh");
		
		System.out.println(ls.size());
		System.out.println(ls);

		HashSet st=new HashSet();
		st.add(1);
		st.add("shiva");
		st.add(1);
		st.add(1.3);
		st.add("sh");
		
		System.out.println(st.size());
		System.out.println(st);
		
		
		HashMap<Integer, String> hm=new HashMap<>();
		
		hm.put(1, "shiva");
		hm.put(2, "shiva1"); 
		hm.put(3, "shiva2");
		hm.put(4, "shiva3");
		hm.put(1, "shiva4");
		System.out.println(hm);
		System.out.println(hm.keySet());
		System.out.println(hm.get(1));
		
		for(Object k:hm.keySet()) {
			System.out.println(k+" "+hm.get(k));
		}
		
		
	}

}

package java_programming;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		String str= "I am shiva shiva am";

		String[] s=str.split(" ");
		
		Set<String> se=new LinkedHashSet<String>();
		
		for(String x:s) {
			se.add(x);
		}
//		System.out.println(se);
		
		//how we print the elements from the set
		// If we want to maintain insertion order from set we need to use Linkedhashset
		Iterator itr=se.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next()+" ");
			
		}
	}

}

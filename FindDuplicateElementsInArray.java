package java_programming;

import java.util.HashMap;
import java.util.HashSet;

public class FindDuplicateElementsInArray {

	public static void main(String[] args) {
		String a[]= {"java","selenium","python","java","corejava","python"};
		
		// Case-1
		boolean status=false;
		for(int i=0;i<=a.length-1;i++) {
			for(int j=i+1;j<=a.length-1;j++) {
				if(a[i]==a[j]) {
					System.out.println("Given array having duplicates that is :"+a[i]);
					status=true;
				}
			}
			
		}
		if(status==false) {
			System.out.println("Given array doesn't having duplicates");
		}
		
		int b[]= {1,2,3,4,5,6,3,4,5,6,7,8,9};
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int y:b) {
			if(map.containsKey(y)) {
				map.put(y, map.get(y)+1);
			}else {
				map.put(y, 1);
			}
		}
		for(Integer z:map.keySet()) {
			if(map.get(z)>1) {
				System.out.print(z+" ");
			}
		}
		
		
		

		
/*		//Case-2
		HashSet<String> dups=new HashSet();
		
		for(String l:a) {
			if(dups.add(l)==false) {
				System.out.println("duplicate element is :"+l);
				status=true;
			}		
		}
		if(status==false) {
			System.out.println("Given array doesn't having duplicates");
		}
		
*/		
		
		
	}

}

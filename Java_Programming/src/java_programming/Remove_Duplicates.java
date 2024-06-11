package java_programming;

import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicates {

	public static void main(String[] args) {
		String str = "I am am shiva shiva";

		Set<String> dups = new HashSet<String>();

		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (!dups.contains(arr[i])) {
				dups.add(arr[i]);
			}

		}
		System.out.println("after removing the duplicates :" + dups);

	}

}

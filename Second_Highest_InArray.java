package java_programming;

import java.util.Arrays;

public class Second_Highest_InArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {23,99,56,77,66,67};
	    int high = 0;
	    int sec = 0;
	    for(int i = 0 ; i <a.length; i++){
	        if(high < a[i]){
	            sec = high;
	            high = a[i];
	        }
	        else if(sec < a[i]){
	            sec = a[i];
	        }
	        
	    }
	    System.out.println("the first highest number is " + high);
	    System.out.println("the second highest number is " + sec);
		
//		for(int i=0;i<arr.length;i++) {
//			if(largest<arr[i]) {
//				secondlargest=largest;
//				largest=arr[i];
//			}else if(secondlargest<arr[i]&&largest>arr[i]) {
//				secondlargest =arr[i];
//			}
//		}
//		System.out.println(secondlargest);

	}

}

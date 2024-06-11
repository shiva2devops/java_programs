package java_programming;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,10,11};
		int sum=0;
/*		System.out.println(a.length);
		for(int i=0;i<=a.length-1;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
*/
		
		//enhanced for loop
		for(int num:a) {
			sum=sum+num;
		}
		System.out.println(sum);
	}

}

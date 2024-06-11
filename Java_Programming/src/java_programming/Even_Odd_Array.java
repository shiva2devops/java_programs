package java_programming;

public class Even_Odd_Array {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int even_nums = 0;
		int odd_nums = 0;

		// Extracting Even Numbers
		System.out.print("Even Nums are :");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);

			}
		}
		
		// Enhanced for loop
		for(int even:a) {
			if(even%2==0) {
				System.out.println("The even nums from enhanced for loop is :"+even);
			}
		}
		
		// Extracting Odd nums
		System.out.println("Odd Nums are :");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.print(a[i]);

			}
		}
	}

}

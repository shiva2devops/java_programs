package java_programming;

public class Star_Patterns {

	public static void main(String[] args) {

		int rows=5;
//		for (int i = 0; i <= 5; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print(" *");
//				}
//				System.out.println();
//			}
			
		
		for(int k=1;k<=rows;k++) {
			for(int m=1;m<=rows-k;m++) {
				
				System.out.print(" ");
			}
			for(int n=1;n<=2*k-1;n++) {
				System.out.print("*");
			}
			System.out.println();
			}
			

//		for (int k = 5; k >= 0; k--) {
//			for (int l = 0; l <= k; l++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
	}

}

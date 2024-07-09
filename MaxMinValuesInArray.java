package java_programming;

public class MaxMinValuesInArray {

	public static void main(String[] args) {
		int a[] = { 2, 3, 4, 1, 6, 8, 9 };
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("The max value is :" + max);

		int min = a[0];
		for (int j = 1; j < a.length; j++) {
			if (a[j] < min) {
				min = a[j];

			}
		}
		System.out.println("The min value is :" + min);

		// Using For each
		int max1 = 0;
		for (int maxm : a) {
			if (max1 > maxm) {
				maxm = max1;
			}
		}
		System.out.println("The max value is :" + max);

	}

}

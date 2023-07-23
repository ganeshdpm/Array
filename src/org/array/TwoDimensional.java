package org.array;

public class TwoDimensional {
	public static void main(String[] args) {

		int a[][] = new int[3][3];

		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;

		a[1][0] = 100;
		a[1][1] = 200;
		a[1][2] = 300;

		a[2][0] = 1000;
		a[2][1] = 2000;
		a[2][2] = 3000;

		// to fetch the particular 2d array
		System.out.println(a[1][2]);

		// to fetch all the array in 2D

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.println(a[i][j]);

			}
		}

		System.out.println("***************");

		for (int[] is : a) {
			for (int x : is) {
				System.out.println(x);
			}

		}

	}

}

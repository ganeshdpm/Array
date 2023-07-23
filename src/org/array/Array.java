package org.array;

public class Array {
	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		
		a[0] = 21;
		a[1] = 54;
		a[4] = 87;
		a[3] = 24;
		a[0] = 98;
		
		// if index not present, it will fetch the default value of the datatype
		System.out.println(a[2]);
		
		//System.out.println(a[5]);
		
		System.out.println("******************");
		
		//to execute all index using f
			//    1				2		4
		for (int i = 0; i < a.length; i++) {
			//					3
			System.out.println(a[i]);
			
		}
		
		
		System.out.println("******************");
		//for each loop
		for (int x : a) {
			System.out.println(x);
			
		}
		
		System.out.println("*******************");
		
		
	}

}

package com.kita.first;

public class ArrayOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 29, 33, 15, 80, 5, 46, 92, 1, 19 };

		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}

			}

			

		}
		for (int k=0; k < arr.length; k++) {
			System.out.print(arr[k] );
			if(arr.length-1!=k) {
   			 System.out.print(",");
   			
   					
   			
   		} 
			
		}

		/*
		 * 
		 * 
		 */

	}

}

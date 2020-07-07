package com.kita.first;

public class OrderBubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 29, 33, 15, 80, 5, 46, 92, 1, 19 };

		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {  
				if (arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				
				}

			}

		}
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k]);
			if (arr.length - 1 != k) {
				System.out.print(",");

			}
		}
	}

}

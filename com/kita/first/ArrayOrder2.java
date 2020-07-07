package com.kita.first;

public class ArrayOrder2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 29, 33, 15, 80, 5, 46, 92, 1, 19 };
        int o = 0;
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			     o=i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[o]) {
					o=j;
				}

			}

			temp = arr[o];
			arr[o] = arr[i];
			arr[i] = temp;

		}
		for (int k=0; k < arr.length; k++) {
			System.out.print(arr[k] );
			if(arr.length-1!=k) {
   			 System.out.print(",");
   			
   					
   			
   		} 
			
		}
		}

}

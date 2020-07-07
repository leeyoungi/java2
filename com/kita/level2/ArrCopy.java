package com.kita.level2;

import java.util.Arrays;

public class ArrCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]={2,4,6,7,10};
    int arr2[]=new int[arr.length];
    System.out.println(arr.equals(arr2));
    System.out.println("arr:"+Arrays.toString(arr));
    if(arr2 != null) {
    	for(int i=0;i<arr.length;i++) {
    		 arr2[i]=arr [i];
    	}

    		System.out.println("arr2:"+Arrays.toString(arr2));
    		
    	
    }
	}

}

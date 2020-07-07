package com.kita.level2;

import java.util.Arrays;

public class ArrCopy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 4, 6, 7, 10,55 };
		int arr2[] = copyArr(arr);
		int arr3[] = copyArr(arr);
		System.out.println(arr == arr2);
		System.out.println("arr:" + Arrays.toString(arr));
		System.out.println("arr2:" + Arrays.toString(arr2));
		System.out.println("arr3:" + Arrays.toString(arr2));
	}

	public static int[] copyArr(int[] arr2) {
		// TODO Auto-generated method stub
		int arr3[] = new int[arr2.length];

		for (int i = 0; i < arr2.length; i++) {
			arr3[i] = arr2[i];

		}
		return arr3;
	}

}

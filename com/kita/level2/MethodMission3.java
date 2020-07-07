package com.kita.level2;

public class MethodMission3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = abs(10);
		System.out.println(result);
		result = abs(-10);
		System.out.println(result);
	}

	private static int abs(int i) {
		// TODO Auto-generated method stub
		/*
		 * if(i<0) { return -i; } return i;
		 */
		return (i < 0) ? -i : i;  //삼항연산자
	}

}

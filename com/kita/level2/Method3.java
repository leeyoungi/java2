package com.kita.level2;

public class Method3 {
/*
 * 
 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=sum(30,20);
		System.out.println(result);
		result=minus(30,17);
		
		System.out.println(result);
	}
	public static int sum(int n1,int n2) {
		return n1+n2;
	}
	public static int minus(int n1,int n2) {
		return n1-n2;
	}
	
}

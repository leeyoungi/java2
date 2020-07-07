package com.kita.first;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 1을 입력");
		String n1 = scan.next();
	
		System.out.println("숫자 2을 입력 :");
		String n2 = scan.next();
	
		scan.close();
		int sum = Integer.parseInt(n1) + Integer.parseInt(n2) ;
		System.out.println(n1+"+"+n2+"="+ sum);
		
 }
}

package com.kita.first;

import java.util.Scanner;

public class Mission6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner scan=new Scanner(System.in);


		int star=0;
		  System.out.println("숫자릉 입력하세요");
		star=scan.nextInt();
		
		  
		for(int i=0;i<star; i++) {
			System.out.print("*");
		}
  System.out.println();
	}

}

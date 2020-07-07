package com.kita.first;

import java.util.Scanner;

public class Mission7 {
 /*
  * 숫자를 입력(종료:0) 5 7 1 0
  * 
  */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scan = new Scanner(System.in);
   int sum=0;
   
   while(true) {
	  
	   
	   int num=0;
	   System.out.print("숫자를 입력(종료 0:)");
	   num=scan.nextInt();
	  
	 
	  
	 
	  if(num==0) {
		  System.out.println("합계 :"+sum);  
		  break;  
		  
	  }
	  sum=sum+num;
	
	 
	   
   }
 
	}

}

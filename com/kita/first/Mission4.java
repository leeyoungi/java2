package com.kita.first;

import java.util.Scanner;

public class Mission4 {
/* 월을 입력해 주세요 : (1 ~ 12)
 * 
 * 3 ~ 5을 입력했다면 " 봄입니다"
 * 6 ~ 8을 입력했다면 " 여름입니다"
 *  9 ~  11 을 입력한다면 " 가을입니다"
 *  12 ~ 2 을 입력한다면  "겨울입니다"
 *   1 ~ 12가 아닌 값을 입력했다면 "잘못 입력하셨습니다
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("월을 입력해 주세요 : (1 ~ 12) ");
		month=scan.nextInt();
		
		switch(month) {
		case 1:  
	        System.out.println("겨울입니다."); break;
		case 2: 
	        System.out.println("겨울입니다."); break;
	        
		case 3: 
        System.out.println("봄입니다.");
        break;
		case 4: 
	        System.out.println("봄입니다."); break;
		case 5: 
	        System.out.println("봄입니다."); break;
		case 6: 
	        System.out.println("여름입니다."); break;
		case 7: 
	        System.out.println("여름입니다."); break;
		case 8: 
	        System.out.println("여름입니다."); break;
		case 9: 
	        System.out.println("가을입니다."); break;
		case 10: 
	        System.out.println("가을입니다."); break;
		case 11: 
	        System.out.println("가을입니다."); break;
		case 12: 
	        System.out.println("겨울입니다."); break;
	        
	        default: 
	        	
	        	 System.out.println("잘못 입력하셨습니다.");
	        	 break;
		}
scan.close();
	}

}

package com.kita.first;

import java.util.Scanner;

public class second {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scan = new Scanner(System.in);
 System.out.print("성별을 입력해주세요:(남/여)");
 String gender=scan.next();
 System.out.print("키를 입력해 주세요:" );
 int height=scan.nextInt();
 scan.close(); 
 if(gender.equals("남") && height < 160 || gender.equals("여") && height < 150 ) {
	 System.out.println("평균 미만입니다.");
 }else if(gender.equals("남") && height == 160 || gender.equals("여") && height == 150) {
	 System.out.println("평균입니다.");

 }else if(gender.equals("남") && height > 160 || gender.equals("여") && height > 150) {
	 System.out.println("평균 초과입니다.");
 }else {
	 
	 System.out.println("잘못 입력됨 ㅋ");
 }
 }
	
}

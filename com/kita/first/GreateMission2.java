package com.kita.first;

import java.util.Scanner;

public class GreateMission2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("-메뉴-");
		System.out.println("1.사이다(500원)");
		System.out.println("2.콜라(600원)");
		System.out.println("3.환타(700원)");
		System.out.println("4.마운틴듀(800원)");
		System.out.println("5.초코우유(400원)");
		System.out.println("6.바나나우유(400원)");

		String[] menu = { "사이다", "콜라", "환타", "마운틴튜", "초코우유", "바나나우유", };
		int[] money = { 500, 600, 700, 800, 400, 400 };
		int sum = 0;
		while (true) {
		
		
			System.out.println("메뉴를 선택하세요");
			int a= scan.nextInt();
			
		

			if (a == 0   || a>6) {
				System.out.println(sum);
				break;
			
			} else if (a < 0 || a > menu.length) {
				continue;
			} else {
				System.out.println(menu[a-1] + " " + money[a-1]);
				sum += money[a-1];
			}
			
		}
		
		
	
		
			
	}

}

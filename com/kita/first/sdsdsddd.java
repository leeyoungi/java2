package com.kita.first;

import java.util.Scanner;

public class sdsdsddd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String month;
		Scanner scan = new Scanner(System.in);
		System.out.println("월을 입력해 주세요 : (봄 /여름 / 가을 / 겨울) ");
		month = scan.next();

		switch (month) {
		case "겨울":
			System.out.println("1월부터 12월입니다.");
			break;
		case "봄":
			System.out.println("3월부터 5월입니다.");
			break;

		case "여름":
			System.out.println("6월부터 8월입니다.");
			break;
		case "가을":
			System.out.println("9월부터 11월입니다.");
			break;

		default:

			System.out.println("잘못 입력하셨습니다.");
			break;
		}
		scan.close();
	}

}

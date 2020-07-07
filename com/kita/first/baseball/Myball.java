package com.kita.first.baseball;

import java.util.Arrays;
import java.util.Scanner;

import com.kita.level2.Array;

public class Myball {
	private int[] myArr;
	private Scanner scan;

	public Myball(int num) {

		init(num);

	}

	private void init(int num) {
		myArr = new int[num];
//		System.out.println(rArr.length);
		scan = new Scanner(System.in);
	}

	public void setNumbers() {
		// TODO Auto-generated method stub

		for (int i = 0; i < myArr.length; i++) {

			System.out.println("숫자 입력" + (i + 1) + ":");
			String val = scan.nextLine();
			try {
				myArr[i] = Integer.parseInt(val);
			} catch (Exception e) {
				// TODO: handle exception
				myArr[i] = 0;
				i--;
				System.out.println("숫자만");
				continue;
			}

			if (myArr[i] < 1 || myArr[i] > 9) {
				i--;
				System.out.println("0에서 9까지입니다.");
				continue;

			}
			for (int j = 0; j < i; j++) {

				if (myArr[j] == myArr[i]) {

					i--;
					System.out.println("중복값나옴");
					break;

				}

			}

		}

	}

	public int get(int i) {
		// TODO Auto-generated method stub
		return myArr[i];
	}

}

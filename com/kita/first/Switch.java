package com.kita.first;

import javax.swing.text.AbstractDocument.BranchElement;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 2;
		switch (num) {
		case 1:
			System.out.println("1이다");
			break;
			
		case 2:

			System.out.println("2이다");
			break;
		case 3:
			System.out.println("3이다");
			break;
		default:
			System.out.println("1 ~ 3 아님");
			break;
		}
	
	}

}

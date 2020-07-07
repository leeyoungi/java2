package com.kita.first;

import java.util.Scanner;

public class Mission5 {
	/*점수를 입력해주세요 : (0 ~ 100)
	 * 90점 이상이면 A
	 * 80점 이상이면 B
	 * 70점 이상이면 C
	 * 나머지는 D입니다. 
	 * 
	 * 일의 자리수가 7점이상이면 +
	 * 일의 자리수가 7점 이하이면 -
	 * 예를 들어 95= A, 97 > A+ 83 >B -
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int score=0;
	
		Scanner scan=new  Scanner(System.in);
		System.out.println("정수를 입력해주세요 : (0 ~ 100)");
		score=scan.nextInt();
		if(score >100 || score < 0) {
			System.out.println("잘못입력");
		}else if(score>=90) {
			System.out.print("A");
		}
		else if(score>=80) {
			System.out.println("B");
			
		}
		else if(score>=70) {
			System.out.println("C");
			
		}
		else if(score<=70) {
			System.out.println("D입니다.");
		}
	
		if(score==100) {
			System.out.print("+");
		}else if(score>=70 && score<=100) {
			int mod=score %10;
			if(mod>=7) {
				System.out.println("+");
				
			}else if(mod<=3) {
				System.out.print("-");
			}
		}

		
		
	}

}

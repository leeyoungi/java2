package com.kita.first;

public class Method1 {

	// void 리턴 타입; 메소드명()안에있는변수를 파라미터 즉 매개변수
	// void main(String [] args]를 선언부
	// 괄호 안에를 구현부 전체를 메소드를 정의했다는 뜻
	// void는 일을 시키면 회신x\
	// 비 void는 일을 시키면 회신
	// 회신이 데이터로 넘어옴 레퍼런스 주소값 일반변수값 리터럴값 주소값도 타입이있음.
	// void와 비void는 호출하는방법이 다름
	// 메소드안에 메소드는 모든 언어에 없음. 메소드끼리는 동급
	// 메소드는 일차 클래스안에 어느 위치라서 상관없음
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(10, 15);
		minus(20,5);
		a("하이");
	}

	public static void sum(int n1, int n2) {
		
		System.out.println(n1 + n2);
	}

	
   static void minus(int n1, int n2) {
		System.out.println(n1- n2);
		
	}
	public static String a(String a) {
		System.out.println(a);
		return a;
	}

}

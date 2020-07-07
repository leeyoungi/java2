package com.kita.first.level3;

//전역변수에서 static이 붙으면 별개

public class Calc {
	static int n1;//맴버필드
	static int n2;//맴버필드

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    
	
	//맴버메소드
	public int sum() {
		// TODO Auto-generated method stub
        int result=n1+n2;
		return result;
	}

	public static int sum(int num1, int num2) {
		num1=Calc.n1;
		num2=Calc.n2;
		return num1 + num2;

	}

}

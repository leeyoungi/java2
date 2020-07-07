package com.kita.first.level3;

public class CalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //전역변수는 맴버필드
		
		int result=Calc.sum(10, 20);//30
		//비 void// 
		System.out.println(result);
        Calc.sum(10, 20);//void
        Calc calc1=new Calc();
        calc1.n1=20;
        calc1.n2=30;
        System.out.println(calc1.sum());//50
	}

}

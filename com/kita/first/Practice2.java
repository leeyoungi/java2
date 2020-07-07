package com.kita.first;

import java.util.Random;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 랜덤값 뽑기
		double r = Math.random();
		
		System.out.println(r);
       int rval=(int)(r *10);
       System.out.println(rval);
       int rval2=(int)(Math.random()*16);
       System.out.println(rval2);
       
       // 1 ~ 15
       
       int rval3=(int)((Math.random()*15)+1);
      
       System.out.println(rval3);
       
       //30 ~50
       
       int rval4= (int)(Math.random()*21)+30;
      
       System.out.println(rval4);
       
       //46 ~77
       int rval5=(int)(Math.random()*32)+46;
       System.out.println(rval5);
      
	}

}

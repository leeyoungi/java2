package com.kita.level2;

public class NormalVsRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num=10;
    System.out.println("before num"+num);
    changeval(num);
    System.out.println("after num"+num);
    int [] numArr= {10};
  

	 
	}

	public static void changeval(int num) {
		// TODO Auto-generated method stub
		num=30;
	}
	public static void changeval(int numArr[]) {
		// TODO Auto-generated method stub
		numArr[0]=30;
	}
}

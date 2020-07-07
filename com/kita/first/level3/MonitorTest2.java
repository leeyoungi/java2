package com.kita.first.level3;

public class MonitorTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Monitor.brand="삼성";
      // 클래스변수가 아닌경우 무조건 객체화시켜서 사용 statc이 붙어야 클래스변수나 클래스 메소드 호출가능
       Monitor m1=new Monitor();
       m1.printInfo();
       Monitor.printBrand();
       m1.printInch();
       
       
       int result=Integer.parseInt("11");
       
	}

}

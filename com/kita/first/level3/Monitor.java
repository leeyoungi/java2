package com.kita.first.level3;

public class Monitor {
  static String brand;// static이붙으면 값 하나밖에저장x 공용 즉 클래스변수,인스턴스 변수
  // static변수는 무조건 메모리에 저장 모든객체가 값은 값을 가지고있을경우 사용 다른값을 가지고 있을때는 사용x
 // static은 모든곳 사용가능 즉 static이 붙은변수만 사용가능
  int inch;
  
  void printInfo() {
	  System.out.printf("brand:%s, inch:%d\n",this.brand,this.inch);
  }
  static void printBrand() {
	  
	  System.out.println(brand);
  }
   void printInch() {
	  System.out.println(inch);
  }
}

package com.kita.first.level4;

public class ValueTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("안녕");
		System.out.println("str " + str);
		System.out.println();

		Value value = new Value(2000);

		System.out.println(value);
		String StrVal=String.valueOf(value);
		String StrVal2=StrVal.toString();
		System.out.println(StrVal);
	
	}
	//클래스앞에 //final 붙이면 상속 금지  메소드앞에 붙이면 오버라이딩 금지
	/*변수앞에 붙이면 상수
	 *  
	 */
	

	
}
